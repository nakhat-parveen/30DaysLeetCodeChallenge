package leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order. */

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<>();
		for(String str : strs) {
			int[] frequency = new int[26];
			for(char c : str.toCharArray()) {
				frequency[c - 'a'] ++ ;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 26; i++) {
				sb.append("#").append(frequency[i]);
			}
			map.putIfAbsent(sb.toString(), new ArrayList<>());
			map.get(sb.toString()).add(str);
		}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> anagramsList = new ArrayList<>();
		anagramsList = groupAnagrams(strs);
		System.out.println("Grouped anagram List : " + anagramsList);

	}

}
