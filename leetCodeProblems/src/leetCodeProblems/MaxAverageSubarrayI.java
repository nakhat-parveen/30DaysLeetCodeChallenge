package leetCodeProblems;

public class MaxAverageSubarrayI {
	
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int left = 0;
		for(int right = 0; right < nums.length; right ++) {
			sum +=  nums[right];
			if(right - left +1 == k) {
				maxSum = Math.max(maxSum, sum);
				sum -= nums[left];
				left ++;
			}
		}
		return (double) maxSum/k;
	}

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		double maxAvg = findMaxAverage(nums, k);
		System.out.println("Max Average of subarray of length " + k + " is :" + maxAvg);

	}

}
