package daily.s2022;

class Solution {
	public int[][] construct2DArray(int[] original, int m, int n) {
		int[][] ret = new int[m][n];
		int len = original.length;
		if (len != m * n) {
			return new int[0][0];
		}
		// i * n + j 可用一个变量代替 count=0; count++;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ret[i][j] = original[i * n + j];
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		int[] original = new int[] { 1, 2, 3 };
		int m = 3;
		int n = 1;
		int[][] construct2dArray = new Solution().construct2DArray(original, m, n);
		for (int[] c : construct2dArray) {
			for (int i : c) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}