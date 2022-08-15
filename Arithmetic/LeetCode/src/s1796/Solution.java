package s1796;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int secondHighest(String s) {
		char[] cs = s.toCharArray();
		Set<Integer> set = new HashSet<>();
		for (char c : cs) {
			if (Character.isDigit(c)) {
				set.add(Integer.parseInt(String.valueOf(c)));
			}
		}
		int size = set.size();
		if (size > 1) {
			return set.toArray(new Integer[0])[size - 2];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().secondHighest("ck077"));
	}
}