package daily.s0048;

class Solution {
    /**
     *  使用了额外的数组。。 找出下标的变化规律即可
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[Math.abs(j - (n - 1))][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new Solution().rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int[] m = matrix[i];
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}