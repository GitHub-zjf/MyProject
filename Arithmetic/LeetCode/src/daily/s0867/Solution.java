package daily.s0867;

/**
 * ����һ����ά�������� matrix�� ���� matrix �� ת�þ��� �� ����� ת�� ��ָ����������Խ��߷�ת���������������������������
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