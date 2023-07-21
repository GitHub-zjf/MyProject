package daily.s0819;

import java.util.Map;
import java.util.TreeMap;

class Solution {
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.replaceAll("[!]|[?]|[']|[,]|[;]|[.]", " ").toLowerCase();
		String[] paraWords = paragraph.split(" {1,}");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String word : paraWords) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		for (String b : banned) {
			map.remove(b);
		}

		int[] max = new int[] { 0 };
		String[] ret = new String[] { "" };

		map.forEach((key, value) -> {
			if (value > max[0]) {
				ret[0] = key;
				max[0] = value;
			}
		});

		return ret[0];
	}

	public static void main(String[] args) {
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = new String[] { "a" };
		System.out.println(new Solution().mostCommonWord(paragraph, banned));
	}
}