package interview_questions.s0506;

/**
 *  ������ 05.06. ����ת��
 */
class Solution {
    public int convertInteger(int A, int B) {
        return Integer.bitCount(A ^ B);
    }
}