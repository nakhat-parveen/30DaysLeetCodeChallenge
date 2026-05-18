package leetCodeProblems;

public class LongestRepeatingCharacterReplacement {
	
	public static int characterReplacement(String s, int k) {
		int left = 0;
		int maxLength = Integer.MIN_VALUE;
		int maxFrequency = Integer.MIN_VALUE;
		int[] frequency = new int[26];
		for(int right = 0; right < s.length(); right ++) {
			frequency[s.charAt(right) - 'A']++;
			maxFrequency = Math.max(maxFrequency, frequency[s.charAt(right) - 'A']);
			int window = right - left + 1;
			if(window - maxFrequency > k) { //charsNeedToBeChanged = window - maxFrequency. if it's greater than k, decrease window size and frequency 
				frequency[s.charAt(left) - 'A']--;
				left ++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "AABABBA";
		int maxLength = characterReplacement(s, 1);
		System.out.println("the length of the longest substring is : " + maxLength);

	}

}
