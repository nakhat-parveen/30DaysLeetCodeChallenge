package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;

/* Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target. */

public class twoSum {
	
	public static int[] twoSum(int nums[], int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				int index = map.get(complement);
				return new int[] {index, i};
			}
		map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,7,11,15};
		System.out.println("two sum indices are: " + Arrays.toString(twoSum(arr, 9)) );
		

	}

}
