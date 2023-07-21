package daily.s0367;

class Solution {
	public boolean isPerfectSquare(int num) {
		int begin = 0;
		int end = num;
		while (begin <= end) {
			int middle = (end - begin) / 2 + begin;
			long temp = (long) middle * middle;
			if (temp < num) {
				begin = middle + 1;
			} else if (temp > num) {
				end = middle - 1;
			} else {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().isPerfectSquare(2147483647));
		// System.out.println(new Solution().isPerfectSquare(25));
	}
}