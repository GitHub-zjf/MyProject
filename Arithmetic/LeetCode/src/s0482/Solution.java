package s0482;

/**
 * 482. ÃÜÔ¿¸ñÊ½»¯
 */
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        int len = s.length();
        String ans = "";
        int i = len - k;
        while (i >= 0) {
            ans = s.substring(i, i + k) + "-" + ans;
            i = i - k;
        }
        if (len % k != 0) {
            ans = s.substring(0, len % k) + "-" + ans;
        }
        return ans.substring(0, ans.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().licenseKeyFormatting("2-5g-3-J", 2));
    }
}