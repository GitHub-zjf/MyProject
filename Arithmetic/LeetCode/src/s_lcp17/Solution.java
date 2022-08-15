package s_lcp17;

class Solution {
	public int calculate(String s) {
		int x = 1;
		int y = 0;
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if ('A' == c) {
				x = 2 * x + y;
			} else {
				y = 2 * y + x;
			}
		}
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().calculate("ABAB"));
	}
}