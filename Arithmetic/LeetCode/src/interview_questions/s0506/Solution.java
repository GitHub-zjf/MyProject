package interview_questions.s0506;

/**
 *  面试题 05.06. 整数转换
 */
class Solution {
    public int convertInteger(int A, int B) {
        return Integer.bitCount(A ^ B);
    }
}