package leetCodeProblems;

public class SearchInRotatedSortedArray {
	
	public static int search(int[] nums, int target) {
		int low  = 0;
		int high = nums.length -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(target == nums[mid]) return mid;
			if(nums[low] < nums[mid]) { //left array is sorted
				if(nums[low] <= target && target <= nums[mid]) { //search in left array & ignore the right
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { //right half is sorted
				if(nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 3;
		int targetIndex = search(nums, target);
		System.out.println("target found in a rotated sorted array at index : " + targetIndex);
	}

}
