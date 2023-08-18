package lcr.s0032;

import java.util.Arrays;

/**
 * LCR 032. ��Ч����ĸ��λ��
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
}