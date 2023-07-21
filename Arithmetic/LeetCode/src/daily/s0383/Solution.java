package daily.s0383;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> ransomMap = new HashMap<>();
		Map<Character, Integer> magazineMap = new HashMap<>();

		char[] charArray = ransomNote.toCharArray();
		char[] charArray2 = magazine.toCharArray();
		for (char c : charArray) {
			ransomMap.put(c, ransomMap.getOrDefault(c, 0) + 1);
		}

		for (char c : charArray2) {
			magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
		}

		Set<Character> keySet = ransomMap.keySet();
		for (Character key : keySet) {
			Integer count = magazineMap.get(key);
			if (count == null) {
				return false;
			}
			Integer count2 = ransomMap.get(key);
			if (count2 > count) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		System.out.println(new Solution().canConstruct(ransomNote, magazine));
	}
}