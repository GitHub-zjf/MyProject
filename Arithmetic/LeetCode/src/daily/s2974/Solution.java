package daily.s2974;

import java.util.Arrays;

/**
 * 2974. ��С������Ϸ
 */
class Solution {
    public int[] numberGame(int[] nums) {
        // ������
        Arrays.sort(nums);
        // ����12��34������ֵ�λ��
        for (int i = 0; i < nums.length; i += 2) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }
}