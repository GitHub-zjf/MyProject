package daily.s0242;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (sLen == tLen) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            for (int i = 0; i < sLen; i++) {
                if (sChars[i] != tChars[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("rat", "car"));
    }
}