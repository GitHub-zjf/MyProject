package s0204;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * @author zheng
 *
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

	public static void main(String[] args) {
//		System.out.println(new Solution().countPrimes(50000));
		System.out.println(new Solution().countPrimes(5000000));
	}
}