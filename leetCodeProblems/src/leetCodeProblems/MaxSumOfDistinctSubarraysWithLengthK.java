package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfDistinctSubarraysWithLengthK {
	
	public static long maximumSubarraySum(int[] nums, int k) {
		long sum = 0;
		long maxSum = 0;
		Map<Integer, Integer> count = new HashMap<>();
		int left = 0;
		for(int right = 0; right < nums.length; right++) {
			sum += nums[right];
			count.put(nums[right], count.getOrDefault(nums[right], 0)+1);
			if(right-left+1 > k) {
				sum -= nums[left];
				count.put(nums[left], count.get(nums[left])-1);
				if(count.get(nums[left]) == 0) {
					count.remove(nums[left]);
				}
				left ++;
			}
			if(right-left+1 == k && count.size() == k) {
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[]nums = {1,5,4,2,9,9,9};
		long maxSum = maximumSubarraySum(nums, 3);
		System.out.println("The maximum subarray sum of all the subarrays is : " + maxSum);

	}

}
