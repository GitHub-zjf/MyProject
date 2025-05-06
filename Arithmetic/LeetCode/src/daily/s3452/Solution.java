package daily.s3452;

/**
 * 3452. 好数字之和
 */
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int x = nums[i];
            if ((i < k || x > nums[i - k]) && (i + k >= len || x > nums[i + k])) {
                sum += x;
            }
        }
        return sum;
    }
}