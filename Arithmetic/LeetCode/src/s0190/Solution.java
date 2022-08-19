package s0190;

public class Solution {
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            ret |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(43261596));
    }
}