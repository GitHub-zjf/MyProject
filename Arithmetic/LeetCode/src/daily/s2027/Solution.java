package daily.s2027;

/**
 * 2027. ת���ַ��������ٲ�������
 */
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'X') {
                i += 3;
                count++;
            } else {
                i += 1;
            }
        }
        return count;
    }
}