package leetCodeProblems;

/* Given a string s, find the length of the longest substring without duplicate characters. */

public class LongestSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
		int[] frequency = new int[128]; 
		int maxLength = Integer.MIN_VALUE;
		int left = 0;
		for(int right = 0; right < s.length(); right++) {
			left = Math.max(left, frequency[s.charAt(right)]);
			maxLength = Math.max(maxLength, right-left+1);
			frequency[s.charAt(right)] = right+1;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		int max_length = lengthOfLongestSubstring(s);
		System.out.println("Lenght of Longest Substring Without Repeating Characters : " + max_length);

	}

}
