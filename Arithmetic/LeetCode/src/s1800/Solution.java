package s1800;

/**
 *  1800. 最大升序子数组和
 */
class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}