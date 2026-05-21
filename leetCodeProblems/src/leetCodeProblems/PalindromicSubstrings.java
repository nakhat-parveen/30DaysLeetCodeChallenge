package leetCodeProblems;

/* Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string. */

public class PalindromicSubstrings {
	
	public static int countSubstrings(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i ++) {
			//count odd length palindrome
			count += countPalindromes(s, i ,i);
			//count even length palindrome
			count += countPalindromes(s, i ,i+1);
			
			
		}
		return count;
	}
	
	public static int countPalindromes(String s, int left , int right) {
		int count = 0;
		while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
			count ++;
			left --;
			right ++;
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "aaa";
		int count =  countSubstrings(s);
		System.out.println("count of total palindromic substrings is : " + count);

	}

}
