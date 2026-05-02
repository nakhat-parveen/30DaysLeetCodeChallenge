package leetCodeProblems;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
		
		int n = nums.length;
		int pos = 0;
		for(int i = 0; i < n ; i ++) {
			if(nums[i] != 0) {
				nums[pos++] = nums[i];
			}
		}
		while(pos < n) {
			nums[pos++] = 0;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println("Array after moving zeroes : " + Arrays.toString(nums));

	}

}
