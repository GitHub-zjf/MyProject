package daily.s2864;

/**
 * 2864. 最大二进制奇数
 */
class Solution {
    public String maximumOddBinaryNumber(String s) {
        String result0 = "";
        String result1 = "";
        boolean first = true;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '0') {
                result0 = "0" + result0;
            } else {
                if (first) {
                    result0 += "1";
                    first = false;
                } else {
                    result1 += "1";
                }
            }
        }
        return result1 + result0;
    }
}