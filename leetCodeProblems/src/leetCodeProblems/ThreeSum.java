package leetCodeProblems;


import java.util.*;

/* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets. */

public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums){
		Set<List<Integer>> res = new HashSet<>();
		Arrays.sort(nums);
		for(int i = 0; i< nums.length; i++) {
			int left = i+1;
			int right = nums.length-1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					res.add(List.of(nums[i],nums[left], nums[right]));
					left++;
					right--;
				}
				else if(sum < 0) {
					left ++;
				} else {
					right --;
				}
			}
		}
		return new ArrayList<>(res);
	}

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		 List<List<Integer>> result = threeSum(nums);
		 System.out.println("List of triplets with sum equals to 0 : " + result);

	}

}
