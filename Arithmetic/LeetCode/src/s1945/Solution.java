package s1945;

/**
 *  1945. �ַ���ת����ĸ�λ����֮��
 */
class Solution {
    public int getLucky(String s, int k) {
        int ret = 0;
        char[] chars = s.toCharArray();
        String str = "";
        for (char c : chars) {
            str += (c - 'a' + 1);
        }

        while (k-- > 0) {
            ret = 0;
            char[] chars1 = str.toCharArray();
            for (char c : chars1) {
                ret += (c - '0');
            }
            str = String.valueOf(ret);
        }

        return ret;
    }
}