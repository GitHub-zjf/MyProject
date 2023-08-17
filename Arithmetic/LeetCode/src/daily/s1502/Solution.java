package daily.s1502;

import java.util.Arrays;

/**
 * 1502. �ж��ܷ��γɵȲ�����
 */
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // ����
        Arrays.sort(arr);
        // �ж�
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}