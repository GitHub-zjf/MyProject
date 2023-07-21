package daily.s2535;

/**
 * 2535. 数组元素和与数字和的绝对差
 */
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int num : nums) {
            sum1 += num;
            while (num != 0) {
                sum2 += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum1 - sum2);
    }
}