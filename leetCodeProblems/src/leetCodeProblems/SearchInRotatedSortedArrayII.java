package leetCodeProblems;

/* There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
You must decrease the overall operation steps as much as possible. */


public class SearchInRotatedSortedArrayII {
	
	public static boolean search(int nums[], int target) {
		int n = nums.length;
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (low + high)/ 2;
			if(target == nums[mid]) return true;
			//keep shrinking the error as long as you encounter similar elements
			if(nums[low] == nums[mid] && nums[high] == nums[mid]) {
				low ++;
				high --;
				continue;
			}
			//left array is sorted
			if(nums[low] < nums[mid] ) {
				if(nums[low] <= target && target <= nums[mid]) { //search in left half
					high = mid-1;
				} else { //search in right half
					low = mid+1;
				}
			} else { //right array is sorted
				if(nums[mid] <= target && target <=nums[high]) {
					low = mid+1; //search in right half
				} else { //search in left half
					high = mid-1;
				}
				
			}
		}
		return false; 
	}

	public static void main(String[] args) {
		int[]nums = {2,5,6,0,0,1,2};
		boolean isTargetFound = search(nums, 6);
		System.out.println("Is target found in a rotated array with non distinct values : " + isTargetFound);

	}

}
