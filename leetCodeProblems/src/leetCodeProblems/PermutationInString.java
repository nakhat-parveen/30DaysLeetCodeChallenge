package leetCodeProblems;

public class PermutationInString {
	
	public static  boolean checkInclusion(String s1, String s2) {
		if(s1.length() > s2.length()) {
            return false;
        }
		int[] s1freq = new int[26];
		for(int i = 0 ; i < s1.length(); i++) {
			s1freq[s1.charAt(i) - 'a']++;
		}
		int windowSize = s1.length();
		for(int i = 0; i < s2.length(); i++) {
			int windowIndex = 0;
			int s2Index = i;
			int[] windowFreq = new int[26];
			while(windowIndex <  windowSize && s2Index < s2.length()) {
				windowFreq[s2.charAt(s2Index) - 'a']++;
				windowIndex++;
				s2Index++;
			}
			if(matchFreq(windowFreq, s1freq)) {
				return true;
			}
		}
		return false;
	}

	public static boolean matchFreq(int[] windowFreq, int[] s1freq) {
		for(int i = 0; i < 26 ; i++) {
			if(windowFreq[i] != s1freq[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2  = "eidboaooo";
		boolean containsPermutation = checkInclusion(s1, s2);
		System.out.println("Does s2 contains a permutation of s1? : " + containsPermutation);

	}

}
