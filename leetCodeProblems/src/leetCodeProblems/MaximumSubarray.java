package leetCodeProblems;

/* Given an integer array nums, find the subarray with the largest sum, and return its sum. */

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int n = nums.length;
		int startIndex = 0;
		int endIndex = 0;
		for(int i = 0; i < n; i++) {
			if(sum == 0) {
				 startIndex = i;
			} 
			sum += nums[i];
			if(sum > max) {
				max = Math.max(max, sum);
			    endIndex = i;
			}

			if(sum < 0) sum = 0;
		}
		//printing the subarray with largest sum
		System.out.print("The subarray with the largest sum is : " + "[");
		for(int i = startIndex; i <= endIndex; i++) {
			if(i == endIndex) {
				System.out.print( nums[i]);
			} else {
				System.out.print( nums[i] + ",");
			}
					
				}
		System.out.println("]");
		
		return max;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = maxSubArray(nums);
		System.out.println("The largest sum of the subarray is : " + maxSum);

	}

}
