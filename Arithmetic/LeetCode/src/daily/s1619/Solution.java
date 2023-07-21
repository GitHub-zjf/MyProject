package daily.s1619;

import java.util.Arrays;

/**
 * 1619. 删除某些元素后的数组均值
 */
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int sum = 0;
        for (int i = len / 20; i < len * 19 / 20; i++) {
            sum += arr[i];
        }

        return sum / (len * 0.9);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10, 8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0, 0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3};
        System.out.println(new Solution().trimMean(arr));
    }
}