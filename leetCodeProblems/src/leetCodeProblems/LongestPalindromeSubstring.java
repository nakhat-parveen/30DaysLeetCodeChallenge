package leetCodeProblems;

public class LongestPalindromeSubstring {
	
	public static  String longestPalindrome(String s) {
		if(s.length() <= 1) return s;
		String longestPalindrome = "";
		for(int i = 0; i < s.length(); i++) {
			//consider odd length palindrome
			int low = i;
			int high = i;
			// keep expanding in both direction till the condition for palindrome met
			while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				//terminate if we reach end/start of the string
				if(low == -1 && high == s.length()) {
					break;
				}
			}
			//Indexes low and high can be used to extract the substring
            String palindrome = s.substring(low+1, high); //low+1 cuz while loop terminates when the string stops being a plaindrome, i.e one index before the plaindromic substring, hence +1 to reach the starting index of substring
			if(palindrome.length() > longestPalindrome.length()) {
				longestPalindrome = palindrome;
			}
			//consider odd length palindrome
			low = i-1;
			high = i;
			while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				if(low == -1 && high == s.length()) {
					break;
				}
			}
		    palindrome  = s.substring(low+1, high);
			if(palindrome.length() > longestPalindrome.length()) {
				longestPalindrome = palindrome;
			}
		}
		return longestPalindrome;
	}

	public static void main(String[] args) {
		String s = "cbbd";
		String LPS = longestPalindrome(s);
		System.out.println("Longest Palindomic substring is : " + LPS);

	}

}
