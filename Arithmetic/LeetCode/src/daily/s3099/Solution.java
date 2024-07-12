package daily.s3099;

/**
 * 3099. 哈沙德数
 */
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        // 计算各位数之和
        int sum = 0;
        int y = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        if (y % sum == 0) {
            return sum;
        }
        return -1;
    }
}