package daily.s3083;

/**
 * 3083. 字符串及其反转中是否存在同一子字符串
 */
class Solution {
    public boolean isSubstringPresent(String s) {
        String str = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            String subStr = s.substring(i, i + 2);
            if (str.contains(subStr)) {
                return true;
            }
        }
        return false;
    }
}