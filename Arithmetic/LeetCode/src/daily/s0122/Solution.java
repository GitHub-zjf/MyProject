package daily.s0122;

/**
 * 121. 买卖股票的最佳时机
 */
class Solution {
    public int maxProfit(int[] prices) {
        // 某阶段的最小值
        int min = Integer.MAX_VALUE;
        // 某阶段的最大值
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
                    result = result + (max - min);
                    min = Integer.MAX_VALUE;
                    max = Integer.MIN_VALUE;
                }
            } else {
                min = Math.min(min, prices[i]);
                max = Math.max(max, prices[i + 1]);
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            result = result + (max - min);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(new Solution().maxProfit(prices));
    }
}