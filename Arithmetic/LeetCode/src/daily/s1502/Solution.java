package daily.s1502;

import java.util.Arrays;

/**
 * 1502. 判断能否形成等差数列
 */
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // 排序
        Arrays.sort(arr);
        // 判断
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}