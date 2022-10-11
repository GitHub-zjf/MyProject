package interview_questions.s1704;

/**
 *  面试题 17.04. 消失的数字
 */
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            sum2 += (i + 1);
        }
        return sum2 - sum;
    }
}