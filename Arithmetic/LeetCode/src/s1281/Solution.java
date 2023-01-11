package s1281;

/**
 * 1281. �����ĸ�λ����֮��
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