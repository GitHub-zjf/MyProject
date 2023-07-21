package daily.s2027;

/**
 * 2027. 转换字符串的最少操作次数
 */
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'X') {
                i += 3;
                count++;
            } else {
                i += 1;
            }
        }
        return count;
    }
}