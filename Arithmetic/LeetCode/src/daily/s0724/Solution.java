package daily.s0724;

/**
 * 724. Ѱ������������±�
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