package daily.s2544;

/**
 *  2544. ½»ÌæÊý×ÖºÍ
 */
class Solution {
    public int alternateDigitSum(int n) {
        int ret = 0;
        String str = String.valueOf(n);
        int x = 1;
        for (char c : str.toCharArray()) {
            ret += Character.getNumericValue(c) * x;
            x = x * -1;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().alternateDigitSum(521));
    }
}