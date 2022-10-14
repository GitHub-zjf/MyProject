package s1979;

/**
 *  1979. 找出数组的最大公约数
 */
class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        while (max % min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return min;
    }

    public static void main(String[] args) {
        new Solution().findGCD(new int[]{319, 329, 377});
    }
}