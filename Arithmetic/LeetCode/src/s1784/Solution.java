package s1784;

import java.util.Stack;

/**
 * 1784. ���������ַ����ֶ�
 */
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}