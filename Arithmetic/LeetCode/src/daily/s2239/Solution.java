package daily.s2239;

/**
 * 2239. 找到最接近 0 的数字
 */
class Solution {
    public int findClosestNumber(int[] nums) {
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            if (abs < min) {
                min = abs;
                minIndex = i;
            } else if (abs == min) {
                if (nums[minIndex] < nums[i]) {
                    minIndex = i;
                }
            }
        }
        return nums[minIndex];
    }
}