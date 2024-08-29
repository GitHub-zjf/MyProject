package daily.s3142;

/**
 * 3142. 判断矩阵是否满足条件
 */
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                // 判断同一列的数字是否不相等
                if (i + 1 < m && num != grid[i + 1][j]) {
                    return false;
                }
                // 判断同一行的相邻数字是否相等
                if (j + 1 < n && num == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}