package s0204;

import java.util.Arrays;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * @author zheng
 */
class Solution {
    // 时间超限
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i);
        }
        return count;
    }

    public int isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    /**
     * 埃筛法
     *
     * @param n
     * @return
     */
    public int countPrimes2(int n) {
        // 先全部标记为true
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);

        // 从2开始，判断如果是质数，那么它相应倍数的数字就标记为合数
        for (int i = 2; i * i < n; i++) {
            if (isPrimes[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrimes[j] = false;
                }
            }
        }

        // 统计
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes2(50000));
    }
}