package s2600;

/**
 * 2600. K 件物品的最大和
 */
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ret = 0;
        while (k > 0) {
            if (numOnes > 0) {
                ret += 1;
                numOnes--;
            } else if (numZeros > 0) {
                ret += 0;
                numZeros--;
            } else if (numNegOnes > 0) {
                ret -= 1;
                numNegOnes--;
            }
            k--;
        }
        return ret;
    }

    public int kItemsWithMaximumSum2(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().kItemsWithMaximumSum(3, 2, 0, 4));
    }
}