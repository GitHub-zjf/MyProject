package s0788;

/**
 *  788. Ðý×ªÊý×Ö
 */
class Solution {
    static int[] check = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};

    public int rotatedDigits(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            char[] cs = String.valueOf(i).toCharArray();
            boolean valid = true, diff = false;
            for (int j = 0; j < cs.length; j++) {
                if (check[cs[j] - '0'] == -1) {
                    valid = false;
                } else if (check[cs[j] - '0'] == 1) {
                    diff = true;
                }
            }
            if (valid && diff) {
                count++;
            }
        }

        return count;
    }
}