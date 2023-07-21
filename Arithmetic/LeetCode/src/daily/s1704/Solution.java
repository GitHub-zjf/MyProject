package daily.s1704;

import java.util.Arrays;
import java.util.List;

/**
 * 1704. ÅÐ¶Ï×Ö·û´®µÄÁ½°ëÊÇ·ñÏàËÆ
 *
 * @author zheng
 */
class Solution {
    /**
     * 2021.02.09
     *
     * @param s
     * @return
     */
    public boolean halvesAreAlike(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int length = s.length();
        char[] str1 = s.substring(0, length / 2).toLowerCase().toCharArray();
        char[] str2 = s.substring(length / 2, length).toLowerCase().toCharArray();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < length / 2; i++) {
            if (vowels.contains(str1[i])) {
                count1++;
            }
            if (vowels.contains(str2[i])) {
                count2++;
            }
        }
        return count1 == count2;
    }

    /**
     *  2022-11-11
     * @param s
     * @return
     */
    public boolean halvesAreAlike2(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len / 2; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            if (vowels.contains(s.charAt(i + len / 2))) {
                count--;
            }
        }
        return count == 0;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().halvesAreAlike("AbCdEfGh"));
    }
}