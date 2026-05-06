package leetCodeProblems;

/* Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
 * then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned). */

public class ReverseInteger {
	
	public static int reverseInteger(int num) {
		int n = num;
		int rev = 0;
		while(num > 0) {
			int rem = num % 10;
			if(rev > Integer.MAX_VALUE || rev == Integer.MAX_VALUE && rem > 7)
				return 0;
			if(rev < Integer.MIN_VALUE || rev == Integer.MIN_VALUE && rem < -8)
				return 0;
			rev = rev * 10 + rem;
			num = num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num  = 2354785;
		int reversedInt = reverseInteger(num);
		System.out.println("reversed Integer is : " + reversedInt);

	}

}
