package daily.s3216;

/**
 *  3216. 交换后字典序最小的字符串
 */
class Solution {
    public String getSmallestString(String s) {
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] % 2 == c[i - 1] % 2 && c[i] < c[i - 1]) {
                swap(c, i, i - 1);
                break;
            }
        }
        return new String(c);
    }

    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}