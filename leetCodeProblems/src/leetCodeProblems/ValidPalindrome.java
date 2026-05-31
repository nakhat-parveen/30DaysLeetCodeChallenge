package leetCodeProblems;

/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise. */

public class ValidPalindrome {
	
	public static  boolean isPalindrome(String s) {
		String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int left = 0;
		int right = str.length()-1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println("Is string " + s + " a valid palindrome? : " + isPalindrome(s));

	}

}
