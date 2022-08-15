package s0807;

class Solution {
	/**
	 *  ���ܳ���ĳһ��ĳһ�е����ֵ����¼ÿһ��ÿһ�е����ֵ��ȡ�����������ֵ��ƫС��һ��
	 * @param grid
	 * @return
	 */
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int len = grid.length;
		// ��¼ÿһ��ÿһ�е����ֵ
		int[] rowMax = new int[len];
		int[] colMax = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				rowMax[i] = Math.max(rowMax[i], grid[i][j]);
				colMax[j] = Math.max(colMax[j], grid[i][j]);
			}
		}
		// �����ֵ
		int ret = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ret += Math.min(rowMax[i], colMax[j]) - grid[i][j];
			}
		}
		return ret;
	}
}