package daily.s2148;

import java.util.Arrays;

/**
 * 2148. ÔªËØ¼ÆÊı
 */
class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0] && nums[i] != nums[nums.length - 1]) {
                ret++;
            }
        }
        return ret;
    }
}