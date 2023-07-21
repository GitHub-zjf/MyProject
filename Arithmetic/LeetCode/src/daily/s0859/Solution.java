package daily.s0859;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
	public boolean buddyStrings(String s, String goal) {
		char[] cs = s.toCharArray();
		char[] gs = goal.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if (s.equals(goal)) {
			for (int i = 0; i < cs.length; i++) {
				map.put(cs[i], map.getOrDefault(cs[i], 0) + 1);
			}
			Set<Character> keySet = map.keySet();
			for (Character character : keySet) {
				if (map.get(character) > 1) {
					return true;
				}
			}
			return false;
		}
		

		int index1 = -1;
		int index2 = -1;

		for (int i = 0; i < cs.length; i++) {
			if (cs[i] != gs[i]) {
				if (index1 == -1) {
					index1 = i;
				} else {
					index2 = i;
				}

				if (index1 != -1 && index2 != -1) {
					char temp = cs[index1];
					cs[index1] = cs[index2];
					cs[index2] = temp;
					return String.valueOf(cs).equals(goal);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "aabd";
		String goal = "aabd";
		System.out.println(new Solution().buddyStrings(s, goal));
	}
}