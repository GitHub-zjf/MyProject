package daily.s1822;

/**
 * 1822. 数组元素积的符号
 */
class Solution {
    public int arraySign(int[] nums) {
        // 统计小于0的个数
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}