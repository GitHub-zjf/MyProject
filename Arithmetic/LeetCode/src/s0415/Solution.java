package s0415;

/**
 *  415. 两个字符串相加
 */
class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int len1 = num1.length();
        int len2 = num2.length();
        int len = Math.abs(len1 - len2);
        if (len1 < len2) {
            for (int i = 0; i < len; i++) {
                num1 = "0" + num1;
            }
        }
        if (len1 > len2) {
            for (int i = 0; i < len; i++) {
                num2 = "0" + num2;
            }
        }
        len = num1.length();
        // 记录是否有进位
        int t = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c1 = num1.charAt(i);
            char c2 = num2.charAt(i);
            int temp = (c1 - '0') + (c2 - '0') + t;
            result = (temp % 10) + result;
            t = temp / 10;
        }

        if (t != 0) {
            result = t + result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("999", "1"));
    }
}