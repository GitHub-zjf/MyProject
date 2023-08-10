package daily.s2259;

/**
 * 2259. 移除指定数字得到的最大结果
 */
class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                last = i;
                if (i < n - 1 && number.charAt(i) < number.charAt(i + 1)) {
                    return number.substring(0, i) + number.substring(i + 1, n);
                }
            }
        }
        return number.substring(0, last) + number.substring(last + 1, n);
    }
}