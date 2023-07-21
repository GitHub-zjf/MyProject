package daily.s2679;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *  2679. 矩阵中的和
 */
class Solution {
    public int matrixSum(int[][] nums) {
        int res = 0;
        int m = nums.length;
        int n = nums[0].length;
        PriorityQueue<Integer>[] pq = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            pq[i] = new PriorityQueue<Integer>((a, b) -> b - a);
            for (int j = 0; j < n; j++) {
                pq[i].offer(nums[i][j]);
            }
        }
        for (int j = 0; j < n; j++) {
            int maxVal = 0;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, pq[i].poll());
            }
            res += maxVal;
        }
        return res;
    }

    public int matrixSum2(int[][] nums) {
        // 对每一行的数字进行排列
        for (int[] r : nums) {
            Arrays.sort(r);
        }

        // 求每一列的最大值，并对最大值累加
        int ret = 0;
        for (int c = 0; c < nums[0].length; c++) {
            int max = 0;
            for (int r = 0; r < nums.length; r++) {
                max = Math.max(nums[r][c], max);
            }
            ret += max;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 8, 16, 15, 12, 9, 15, 11, 18, 6, 16, 4, 9, 4},
                {3, 19, 8, 17, 19, 4, 9, 3, 2, 10, 15, 17, 3, 11},
                {13, 10, 19, 20, 6, 17, 15, 14, 16, 8, 1, 17, 0, 2},
                {12, 20, 0, 19, 15, 10, 7, 10, 2, 6, 18, 7, 7, 4},
                {17, 14, 2, 2, 10, 16, 15, 3, 9, 17, 9, 3, 17, 10},
                {17, 6, 19, 17, 18, 9, 14, 2, 19, 12, 10, 18, 7, 9},
                {5, 6, 5, 1, 19, 8, 15, 2, 2, 4, 4, 1, 2, 17},
                {12, 16, 8, 16, 7, 6, 18, 13, 18, 8, 14, 15, 20, 11},
                {2, 10, 19, 3, 15, 18, 20, 10, 6, 7, 0, 8, 3, 7},
                {11, 5, 10, 13, 1, 3, 4, 7, 1, 18, 20, 17, 19, 2},
                {0, 3, 20, 6, 19, 18, 3, 12, 2, 11, 3, 1, 19, 0},
                {6, 5, 3, 15, 6, 1, 0, 17, 13, 19, 3, 8, 2, 7},
                {2, 20, 9, 11, 13, 5, 1, 16, 14, 1, 19, 3, 12, 6}};

        System.out.println(new Solution().matrixSum(nums));
    }
}