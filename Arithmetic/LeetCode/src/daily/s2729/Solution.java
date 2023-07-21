package daily.s2729;

/**
 * 2729. 判断一个数是否迷人
 */
class Solution {
    public boolean isFascinating(int n) {
        if (n < 123 || n > 329) {
            return false;
        }
        int mask = 0;
        for (char c : ("" + n + (n * 2) + (n * 3)).toCharArray()) {
            mask |= 1 << (c - '0');
        }
        return mask == (1 << 10) - 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 100; i < 999; i++) {
            if (solution.isFascinating(i)) {
                System.out.println(i);
            }
        }
    }
}