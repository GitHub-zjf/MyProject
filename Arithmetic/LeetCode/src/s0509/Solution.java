package s0509;

/**
 * 509. ì³²¨ÄÇÆõÊý
 */
class Solution {
    public int fib(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
        if (n < 2) {
            return n;
        }
        int p, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}