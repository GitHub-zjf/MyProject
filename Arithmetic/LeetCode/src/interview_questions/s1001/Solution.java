package interview_questions.s1001;

import java.util.Arrays;

/**
 * 面试题 10.01. 合并排序的数组
 */
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < m + n; i++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}