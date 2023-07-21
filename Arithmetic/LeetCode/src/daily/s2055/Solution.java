package daily.s2055;

import java.util.Arrays;

class Solution {
	public int[] platesBetweenCandles(String s, int[][] queries) {
		int n = s.length();
		int[] preSum = new int[n];
		for (int i = 0, sum = 0; i < n; i++) {
			if (s.charAt(i) == '*')
				sum++;
			preSum[i] = sum;
		}
		int[] left = new int[n];
		for (int i = 0, l = -1; i < n; i++) {
			if (s.charAt(i) == '|')
				l = i;
			left[i] = l;
		}
		int[] right = new int[n];
		for (int i = n - 1, r = -1; i >= 0; i--) {
			if (s.charAt(i) == '|')
				r = i;
			right[i] = r;
		}
		int[] ans = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			int x = right[query[0]], y = left[query[1]];
			ans[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "***|**|*****|**||**|*";
		int[][] queries = new int[][] { { 1, 17 }, { 4, 5 }, { 14, 17 }, { 5, 11 }, { 15, 16 } };
		int[] platesBetweenCandles = new Solution().platesBetweenCandles(s, queries);
		Arrays.stream(platesBetweenCandles).forEach(i -> {
			System.err.println(i);
		});
	}
}