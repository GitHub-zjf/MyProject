package daily.s0748;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		licensePlate = licensePlate.toLowerCase().replaceAll("[\\d | ]", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < licensePlate.length(); i++) {
			char charAt = licensePlate.charAt(i);
			map.put(charAt, map.getOrDefault(charAt, 0) + 1);
		}

		String result = "";
		int resultLen = 0;

		first: for (String word : words) {
			if (word.length() < licensePlate.length()) {
				continue;
			} else {
				Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
				for (int i = 0; i < word.length(); i++) {
					char charAt = word.charAt(i);
					tempMap.put(charAt, tempMap.getOrDefault(charAt, 0) + 1);
				}
				for (int i = 0; i < licensePlate.length(); i++) {
					Integer count1 = map.get(licensePlate.charAt(i));
					Integer count2 = tempMap.get(licensePlate.charAt(i));
					if (count2 == null || count2 <= 0 || count1 > count2) {
						continue first;
					}
				}
				if (resultLen == 0) {
					result = word;
					resultLen = word.length();
				} else if (word.length() < resultLen) {
					result = word;
					resultLen = word.length();
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String licensePlate = "iMSlpe4";
		String[] words = new String[] { "claim", "consumer", "student", "camera", "public", "never", "wonder", "simple",
				"thought", "use" };
		System.out.println(new Solution().shortestCompletingWord(licensePlate, words));
	}
}