package interview_questions.s0101;

import java.util.HashSet;
import java.util.Set;

/**
 * ������ 01.01. �ж��ַ��Ƿ�Ψһ
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
     *  ��ʹ�ö������ݽṹ
     * @param astr
     * @return
     */
    public boolean isUnique2(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            //�鿴�����Ƿ��е�ǰ�ַ�
            if (astr.indexOf(c, i + 1) != -1) {
                return false;
            }

        }
        return true;
    }

}