package daily.s0775;

/**
 *  775. 全局倒置与局部倒置
 */
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int max = nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < max) {
                return false;
            }
            max = Math.max(max, nums[i - 1]);
        }
        return true;
    }
}