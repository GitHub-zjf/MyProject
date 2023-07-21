package daily.s1832;

/**
 * 1832. �жϾ����Ƿ�Ϊȫ��ĸ��
 */
class Solution {
    public boolean checkIfPangram(String sentence) {
        int state = 0;
        char[] chars = sentence.toCharArray();
        for (char c : chars) {
            state = state | (1 << (c - 'a'));
        }
        return state == (1 << 26) - 1;
    }
}
