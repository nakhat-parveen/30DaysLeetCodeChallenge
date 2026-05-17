package leetCodeProblems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
		int res[] = new int[nums.length];
		res[0] = 1;
		for(int i = 1; i < nums.length; i++) {
			res[i] = res[i-1] * nums[i-1]; //product of prefix of index i, i.e, product of all left elements of index i
		}
		int suffix = 1; //for product of all elements on right side of index i
		for(int i = nums.length-2; i >=0; i--) {
			suffix *= nums[i+1];
			res[i] *= suffix; //product of suffix(right array product) and prefix (left array product)
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[]nums = {-1,1,0,-3,3};
		int[] res = productExceptSelf(nums);
		System.out.println(Arrays.toString(res));
	}

}
/*Brute force approach */
/*  public static int[] productExceptSelf(int[] nums) {
		int res[] = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			int product = 1;
			for(int j = 0; j < nums.length; j++) {
				if(i != j) {
					product *= nums[j];
					res[i] = product;
				}
			}
		}
		return res;
	}
	*/