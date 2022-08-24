package s1460;

import java.util.Arrays;

/**
 * 1460. ͨ����ת������ʹ�����������
 */
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = target.length;

        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }
}