package daily.s3174;

/**
 * 3174. Çå³ýÊý×Ö
 */
class Solution {
    public String clearDigits(String s) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                ret.deleteCharAt(ret.length() - 1);
            } else {
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();

    }
}