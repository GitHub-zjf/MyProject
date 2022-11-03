package s1668;

/**
 * 1668. 最大重复子字符串
 */
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder sb = new StringBuilder(word);
        int max = sequence.length() / word.length();
        for (; k < max; k++) {
            if (!sequence.contains(sb.toString())) {
                break;
            }
            sb.append(word);
        }
        return k;
    }
}