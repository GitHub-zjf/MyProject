package daily.s1413;

class Solution {
    public int minStartValue(int[] nums) {
        int ret = 0;
        // 求出累加过程的最小和
        int min = Integer.MAX_VALUE;
        int minSum = 0;
        for (int num : nums) {
            minSum = minSum + num;
            min = Math.min(min, minSum);
        }

        if (min <= 0) {
            ret = min * -1 + 1;
        } else {
            ret = 1;
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, -2, -3};
        System.out.println(new Solution().minStartValue(nums));
    }
}