package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> unique = new HashSet<>();
		for(int num : nums) {
			if(unique.contains(num)) return true;
			unique.add(num);
		}
		return false;
		
		//2nd method
		/*Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] == nums[i]) return true;
			
		}
		return false; */
	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2} ;
		System.out.println("Does the array contains duplicates : " + containsDuplicate(nums));

	}

}
