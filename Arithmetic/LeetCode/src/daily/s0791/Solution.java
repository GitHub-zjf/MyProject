package daily.s0791;

/**
 *  791. ×Ô¶¨Òå×Ö·û´®ÅÅÐò
 */
class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = order.toCharArray();
        for (char c : chars) {
            while (s.indexOf(c) != -1) {
                sb.append(c);
                s = s.replaceFirst(String.valueOf(c), "");
            }
        }
        return sb.toString() + s;
    }

    public static void main(String[] args) {
        String order = "cbafg";
        String s = "abcd";
        System.out.println(new Solution().customSortString(order, s));
    }
}