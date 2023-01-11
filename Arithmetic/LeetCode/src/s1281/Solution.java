package s1281;

/**
 * 1281. 整数的各位积和之差
 */
class Solution {
    public int subtractProductAndSum(int n) {
        int cum = 1;
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            cum *= temp;
            n /= 10;
        }
        return cum - sum;
    }
}