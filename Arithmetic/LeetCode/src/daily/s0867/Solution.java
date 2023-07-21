package daily.s0867;

/**
 * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * 
 * @author zheng
 *
 */
class Solution {
	public int[][] transpose(int[][] matrix) {
		int len_m = matrix.length;
		int len_0 = matrix[0].length;
		int[][] result = new int[len_0][len_m];
		for (int i = 0; i < len_m; i++) {
			for (int j = 0; j < len_0; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		new Solution().transpose(matrix);
	}
}