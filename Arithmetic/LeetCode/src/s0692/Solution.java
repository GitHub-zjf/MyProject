package s0692;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public List<String> topKFrequent(String[] words, int k) {

		List<String> list = new ArrayList<String>();
		int len = k;
		Map<String, Integer> map = new HashMap<String, Integer>();
		int max = 0;
		for (String word : words) {
			int count = map.getOrDefault(word, 0) + 1;
			map.put(word, count);
			max = Math.max(max, count);
		}

		while (k > 0) {
			List<String> list2 = new ArrayList<>();
			for (String key : map.keySet()) {
				int value = map.get(key);
				if (max == value) {
					list2.add(key);
					// map.remove(key);
					k--;
				}
			}
			list2.sort((o1, o2) -> {
				return o1.compareTo(o2);
			});
			list.addAll(list2);
			max--;
		}

		return list.subList(0, len);

	}

	public static void main(String[] args) {
		String[] words1 = new String[] { "i", "love", "leetcode", "i", "love", "coding", "j", "j", "k", "k" };
		String[] words2 = new String[] { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };

		int k = 2;
		System.out.println(new Solution().topKFrequent(words1, k));
	}
}