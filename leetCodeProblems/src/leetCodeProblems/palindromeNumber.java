package leetCodeProblems;

public class palindromeNumber {
	
	public static boolean isPalindrome(int x) {
		int rem;
		int reverse = 0;
		int original = x;
		while(x > 0) {
			rem = x % 10;
			reverse = (reverse * 10) + rem;
			x = x / 10;
		}
		if(original == reverse) return true;
		return false;
	}
	
	public static void main(String args[]) {
		int x = 91819;
		isPalindrome(x);
		boolean res = isPalindrome(x);
		System.out.println("is number " + x + " a palindrome? : " + res);
	}
	
	

}
