package daily.s0766;
/**
 * 	����һ�� m x n �ľ��� matrix ���������������������ľ��󣬷��� true �����򣬷��� false ��
 *	���������ÿһ�������ϵ����µĶԽ����ϵ�Ԫ�ض���ͬ����ô��������� �������ľ��� ��
 * @author zheng
 *
 */
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
    	int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	int[][] matrix = new int[1][1];
		System.out.println(new Solution().isToeplitzMatrix(matrix));
	}
}