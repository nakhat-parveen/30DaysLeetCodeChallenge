package leetCodeProblems;

public class MinimumSizeSubarraySum {
	
	public static int minSubArrayLen(int target, int[] nums) {
		int left = 0;
		int minLength = Integer.MAX_VALUE;
		int sum = 0;
		for(int right = 0; right < nums.length; right ++) {
			sum += nums[right];
			while(sum >= target) {
				minLength = Math.min(minLength, right-left+1);
				sum -= nums[left];
				left++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

	public static void main(String[] args) {
		int[]nums = {2,3,1,2,4,3};
		int minLength = minSubArrayLen(7, nums);
		System.out.println("The min length of a subarray whose sum is greater than or equal to target is : " + minLength);;

	}

}
