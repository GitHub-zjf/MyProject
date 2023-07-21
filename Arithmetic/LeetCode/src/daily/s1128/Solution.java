package daily.s1128;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int numEquivDominoPairs(int[][] dominoes) {
		int count = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int[] dominoe : dominoes) {
			Integer key = dominoe[0] < dominoe[1] ? dominoe[0] * 10 + dominoe[1] : dominoe[0] + dominoe[1] * 10;
			Integer tempCount = map.getOrDefault(key, 0);
			count += tempCount;
			map.put(key, tempCount + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[][] dominoes = new int[][] { { 1, 2 }, { 2, 1 }, { 1, 2 }, { 1, 2 } };
		System.out.println(new Solution().numEquivDominoPairs(dominoes));
	}
}