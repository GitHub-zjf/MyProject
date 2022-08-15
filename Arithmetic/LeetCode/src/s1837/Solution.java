package s1837;

class Solution {
	public int sumBase(int n, int k) {
		int ret = 0;
		while (n != 0) {
			ret += n % k;
			n /= k;
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().sumBase(10, 10));
	}
}