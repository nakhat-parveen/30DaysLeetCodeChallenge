package leetCodeProblems;

/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

public class BuyingAndSellingStock {
	
	public static int maxProfit(int[] nums) {
		int maxProfit = Integer.MIN_VALUE;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length; i++) {
			minPrice = Math.min(minPrice, nums[i]);
			int profit = nums[i] - minPrice;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {7,1,5,3,6,4};
		int max_profit = maxProfit(nums);
		System.out.println("Maximum profit is : " + max_profit);

	}

}
