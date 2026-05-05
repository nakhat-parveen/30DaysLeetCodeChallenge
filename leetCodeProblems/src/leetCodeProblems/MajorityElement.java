package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

/* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array. */

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> count = new HashMap<>();
		for(int i = 0; i < nums.length; i ++) {
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if(entry.getValue() > nums.length/2)
				return entry.getKey();
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {2,2,1,1,1,2,2};
		int majorityElement = majorityElement(nums);
		System.out.println("Majority Element is : " + majorityElement);

	}

}
