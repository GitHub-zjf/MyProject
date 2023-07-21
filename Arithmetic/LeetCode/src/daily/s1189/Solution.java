package daily.s1189;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int maxNumberOfBalloons(String text) {
		// balloon
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] texts = text.split("");
		for (String t : texts) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

		Integer bCount = map.getOrDefault("b", 0);
		Integer aCount = map.getOrDefault("a", 0);
		Integer lCount = map.getOrDefault("l", 0) / 2;
		Integer oCount = map.getOrDefault("o", 0) / 2;
		Integer nCount = map.getOrDefault("n", 0);

		int ret = 0;
		ret = Math.max(ret, bCount);
		ret = Math.min(ret, aCount);
		ret = Math.min(ret, lCount);
		ret = Math.min(ret, oCount);
		ret = Math.min(ret, nCount);

		return ret;
	}

	public static void main(String[] args) {
		String text = "l";
		System.out.println(new Solution().maxNumberOfBalloons(text));
	}
}