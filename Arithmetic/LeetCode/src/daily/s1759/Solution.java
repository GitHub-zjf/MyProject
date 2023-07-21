package daily.s1759;

/**
 * 1759. 统计同构子字符串的数目
 */
class Solution {
    public int countHomogenous(String s) {
        long ret = 0;
        char prev = s.charAt(0);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (prev == s.charAt(i)) {
                cnt++;
            } else {
                ret += (long) (cnt + 1) * cnt / 2;
                cnt = 1;
                prev = s.charAt(i);
            }
        }
        ret += (long) (cnt + 1) * cnt / 2;
        return (int) (ret % 1000000007);
    }
}
