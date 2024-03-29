package daily.s0485;

/**
 * 485. 最大连续 1 的个数
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int con = 0;
        for (int num : nums) {
            if (num == 1) {
                con++;
                max = Math.max(max, con);
            } else {
                con = 0;
            }
        }
        return max;
    }
}