package daily.s0397;

class Solution {
	public int integerReplacement(int n) {
		if (n <= 1) {
			return 0;
		}

		if (n % 2 == 0) {
			return 1 + integerReplacement(n / 2);
		} else {
			return 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().integerReplacement(15));
	}
}