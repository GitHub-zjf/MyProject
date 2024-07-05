package daily.s3033;

/**
 * 3033. 修改矩阵
 */
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] answer = matrix;
        // 记录每一列的最大值
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                colMax[i] = Math.max(colMax[i], matrix[j][i]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i][j] == -1) {
                    answer[i][j] = colMax[j];
                }
            }
        }

        return answer;
    }

}