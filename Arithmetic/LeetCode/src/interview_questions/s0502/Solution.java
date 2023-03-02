package interview_questions.s0502;

/**
 *  面试题 05.02. 二进制数转字符串
 */
class Solution {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while (sb.length() <= 32 && num != 0) {
            num = num * 2;
            int temp = (int) num;
            sb.append(temp);
            num = num - temp;
        }
        return sb.length() <= 32 ? sb.toString() : "ERROR";
    }
}