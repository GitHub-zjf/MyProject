package daily.s1893;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public boolean isCovered(int[][] ranges, int left, int right) {
		Set<Integer> set = new HashSet<>();
		for (int[] range : ranges) {
			for (int i = range[0]; i <= range[1]; i++) {
				set.add(i);
			}
		}

		for (int i = left; i <= right; i++) {
			if (!set.contains(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] ranges = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int left = 2;
		int right = 5;
		System.out.println(new Solution().isCovered(ranges, left, right));
	}
}