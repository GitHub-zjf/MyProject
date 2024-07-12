package daily.s2974;

import java.util.Arrays;

/**
 * 2974. 最小数字游戏
 */
class Solution {
    public int[] numberGame(int[] nums) {
        // 先排序
        Arrays.sort(nums);
        // 交换12，34间隔数字的位置
        for (int i = 0; i < nums.length; i += 2) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }
}