package interview_questions.s0109;

/**
 * ÃæÊÔÌâ 01.09. ×Ö·û´®ÂÖ×ª
 */
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int len = s1.length();
        if (len == 0) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            s1 = s1.substring(1, len) + s1.substring(0, 1);
            if (s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFlipedString2(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        new Solution().isFlipedString("water", "ewgat");
    }
}