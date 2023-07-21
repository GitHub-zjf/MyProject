package daily.s0017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static Map<String, List<String>> map = new HashMap<String, List<String>>();

	static {
		map.put("1", new ArrayList<>());
		map.put("2", Arrays.asList("a", "b", "c"));
		map.put("3", Arrays.asList("d", "e", "f"));
		map.put("4", Arrays.asList("g", "h", "i"));
		map.put("5", Arrays.asList("j", "k", "l"));
		map.put("6", Arrays.asList("m", "n", "o"));
		map.put("7", Arrays.asList("p", "q", "r", "s"));
		map.put("8", Arrays.asList("t", "u", "v"));
		map.put("9", Arrays.asList("w", "x", "y", "z"));
	}

	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if (digits.length() == 0) {
			return map.get("1");
		} else if (digits.length() == 1) {
			return map.get(digits);
		} else {
			List<String> list = map.get(digits.substring(0, 1));
			List<String> list2 = letterCombinations(digits.substring(1, digits.length()));
			for (String l : list) {
				for (String l2 : list2) {
					result.add(l + l2);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String digits = "234";
		new Solution().letterCombinations(digits);
	}
}