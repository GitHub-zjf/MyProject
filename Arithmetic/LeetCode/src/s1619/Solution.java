package s1619;

import java.util.Arrays;

/**
 *  1619. ɾ��ĳЩԪ�غ�������ֵ
 */
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int sum = 0;
        int num = (int) (len * 0.05);
        for (int i = num; i < len - num; i++) {
            sum += arr[i];
        }

        return sum / ((len - 2 * num) * 1.0);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10, 8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0, 0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3};
        System.out.println(new Solution().trimMean(arr));
    }
}