package daily.s1903;

/**
 * 1903. 字符串中的最大奇数
 */
class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            int temp = num.charAt(i) - '0';
            if (temp % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new Solution().largestOddNumber("7542351161"));
    }
}