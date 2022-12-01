package s1758;

/**
 * 1758. 生成交替二进制字符串的最少操作数
 */
class Solution {
    public int minOperations(String s) {
        int result = 0;
        char[] sc = s.toCharArray();
        char preChar = sc[0];
        for (int i = 1; i < sc.length; i++) {
            if (preChar == sc[i]) {
                result++;
                preChar = (char) (preChar ^ 1);
            } else {
                preChar = sc[i];
            }
        }
        return Math.min(result, s.length() - result);
    }
}