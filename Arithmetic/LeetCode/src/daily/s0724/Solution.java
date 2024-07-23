package daily.s0724;

/**
 * 724. 寻找数组的中心下标
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pre == sum - nums[i]) {
                return i;
            }
            pre += nums[i];
            sum -= nums[i];
        }
        return -1;
    }
}