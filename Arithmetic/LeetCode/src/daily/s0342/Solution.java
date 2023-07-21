package daily.s0342;

/**
 * 4µÄÃÝ
 */
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        double pow = 0;
        for (int i = 0; pow < n; i++) {
            pow = Math.pow(4, i);
            if (pow == n) {
                return true;
            }
        }
        return false;
    }

    public boolean isPowerOfFour2(int n) {
        return Integer.bitCount(n) == 1 && Integer.toBinaryString(n).length() % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfFour2(-1));
    }
}