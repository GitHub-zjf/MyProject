package daily.s3174;

import java.util.ArrayList;
import java.util.List;

/**
 * 3174. �������
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

    public static void main(String[] args) {
        new Solution().clearDigits("abc123");
    }
}