package interview_questions.s0502;

/**
 *  ������ 05.02. ��������ת�ַ���
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