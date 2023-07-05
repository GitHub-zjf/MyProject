package s2710;

/**
 * 2710. ÒÆ³ý×Ö·û´®ÖÐµÄÎ²ËæÁã
 */
class Solution {
    public String removeTrailingZeros(String num) {
        int end = num.length() - 1;
        while (num.charAt(end) == '0') {
            end--;
        }
        return num.substring(0, end + 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeTrailingZeros("51230100"));
    }
}