package interview_questions.s0101;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 */
class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        int len = astr.length();
        for (int i = 0; i < len; i++) {
            set.add(astr.charAt(i));
        }
        return set.size() == len;
    }

    /**
     *  不使用额外数据结构
     * @param astr
     * @return
     */
    public boolean isUnique2(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            //查看后面是否有当前字符
            if (astr.indexOf(c, i + 1) != -1) {
                return false;
            }

        }
        return true;
    }

}