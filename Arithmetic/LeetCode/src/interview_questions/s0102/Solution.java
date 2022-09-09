package interview_questions.s0102;

import java.util.Arrays;

/**
 * 面试题 01.02. 判定是否互为字符重排
 */
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return chars1.length == chars2.length && String.valueOf(chars1).equals(String.valueOf(chars2));
    }
}