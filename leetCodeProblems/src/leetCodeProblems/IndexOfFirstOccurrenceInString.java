package leetCodeProblems;

/* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack 
 * or -1 if needle is not part of haystack. */

public class IndexOfFirstOccurrenceInString {
	
	public static int strStr(String haystack, String needle) {
		if(haystack.length() < needle.length()) {
			return -1;
		}
		if(haystack.length() == 1 &&  needle.length() ==1) {
			if(haystack.equals(needle))
				return 0;
		}
		for(int i = 0 ; i <= haystack.length() - needle.length() ; i ++) {
			if(haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";
		int index = strStr(haystack, needle);
		System.out.println("The Index of the First Occurrence in a String is : " + index);

	}

}
