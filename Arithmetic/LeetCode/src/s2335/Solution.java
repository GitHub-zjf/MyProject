package s2335;

import java.util.Arrays;

/**
 *  2335. װ��������Ҫ�������ʱ��
 */
class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] > amount[0] + amount[1]) {
            return amount[2];
        }
        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
}