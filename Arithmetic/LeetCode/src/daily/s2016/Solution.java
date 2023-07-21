package daily.s2016;

/**
 * 2016. ����Ԫ��֮�������ֵ
 */
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = -1, preMin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > preMin) {
                max = Math.max(max, nums[i] - preMin);
            } else {
                preMin = nums[i];
            }
        }
        return max;
    }
}