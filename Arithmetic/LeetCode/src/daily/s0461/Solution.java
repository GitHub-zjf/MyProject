package daily.s0461;

class Solution {
	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public static void main(String[] args) {
		System.out.println(new Solution().hammingDistance(2164546, 123131));
	}
}