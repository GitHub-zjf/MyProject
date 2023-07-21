package daily.s1475;

/**
 * 1475. 商品折扣后的最终价格
 */
class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            int min = 0;
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= prices[i]) {
                    min = prices[j];
                    break;
                }
            }
            ret[i] = prices[i] - min;
        }

        return ret;
    }
}