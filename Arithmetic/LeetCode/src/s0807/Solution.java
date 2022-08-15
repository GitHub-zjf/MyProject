package s0807;

class Solution {
	/**
	 *  不能超过某一行某一列的最大值，记录每一行每一列的最大值，取行列两个最大值中偏小的一个
	 * @param grid
	 * @return
	 */
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int len = grid.length;
		// 记录每一行每一列的最大值
		int[] rowMax = new int[len];
		int[] colMax = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				rowMax[i] = Math.max(rowMax[i], grid[i][j]);
				colMax[j] = Math.max(colMax[j], grid[i][j]);
			}
		}
		// 计算差值
		int ret = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ret += Math.min(rowMax[i], colMax[j]) - grid[i][j];
			}
		}
		return ret;
	}
}