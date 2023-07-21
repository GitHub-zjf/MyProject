package daily.s1832;

/**
 * 1832. 判断句子是否为全字母句
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
