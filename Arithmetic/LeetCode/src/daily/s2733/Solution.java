package daily.s2733;

import java.util.Arrays;

/**
 * 2733. �Ȳ�����СֵҲ�������ֵ
 */
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        Arrays.sort(nums, 0, 3);
        return nums[1];
    }
}