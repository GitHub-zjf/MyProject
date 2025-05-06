package daily.s1920;

/**
 * 1920. 基于排列构建数组
 */
class Solution {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            ret[i] = nums[nums[i]];
        }
        return ret;
    }
}