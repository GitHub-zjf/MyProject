package s1310;

class Solution {
	public int[] xorQueries(int[] arr, int[][] queries) {
		int len = queries.length;
		int[] rets = new int[len];
		for (int i = 0; i < len; i++) {
			int x = queries[i][0];
			int y = queries[i][1];
			int ret = arr[x];
			for (int j = x + 1; j <= y; j++) {
				ret ^= arr[j];
			}
			rets[i] = ret;
		}
		return rets;
	}
}