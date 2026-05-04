package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

/* Given two strings s and t, return true if t is an anagram of s
 *  and false otherwise. */

public class ValidAnagram {
	
	public static boolean isValidAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		Map<Character, Integer> scount = new HashMap<>();
		Map<Character, Integer> tcount = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			scount.put(s.charAt(i), scount.getOrDefault(s.charAt(i), 0) +1);
			tcount.put(t.charAt(i), tcount.getOrDefault(t.charAt(i), 0) +1);
		}
		return scount.equals(tcount);
	}

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram" ;
		boolean isValid = isValidAnagram(s, t);
		System.out.println("Are Strings " + s + " and " + t + " valid anagrams? : " + isValid);

	}

}
