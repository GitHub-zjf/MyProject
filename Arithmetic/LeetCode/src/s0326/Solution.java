package s0326;

/*
 * 3µÄÃÝ
 */
class Solution {
	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		double pow = 0;
		for (int i = 0; pow <= n; i++) {
			pow = Math.pow(3, i);
			if (pow == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfThree(-27));
	}
}