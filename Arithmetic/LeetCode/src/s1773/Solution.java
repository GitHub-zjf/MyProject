package s1773;

import java.util.List;

class Solution {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int[] count = new int[] { 0 };
		int[] index = new int[] { 0 };
		if ("color".equals(ruleKey)) {
			index[0] = 1;
		}
		if ("name".equals(ruleKey)) {
			index[0] = 2;
		}
		items.forEach(item -> {
			if (ruleValue.equals(item.get(index[0]))) {
				count[0]++;
			}
		});
		return count[0];
	}
}