package daily.s3142;

/**
 * 3142. �жϾ����Ƿ���������
 */
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                // �ж�ͬһ�е������Ƿ����
                if (i + 1 < m && num != grid[i + 1][j]) {
                    return false;
                }
                // �ж�ͬһ�е����������Ƿ����
                if (j + 1 < n && num == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}