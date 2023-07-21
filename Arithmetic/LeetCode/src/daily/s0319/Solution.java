package daily.s0319;

class Solution {
	public int bulbSwitch(int n) {
		if (n <= 1) {
			return n;
		}
		int[] bulbs = new int[n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				bulbs[i] = 1;
			} else {
				bulbs[i] = 0;
			}
		}

		for(int b:bulbs){
			System.out.println(b);
		}

		return 0;
	}

	public static void main(String[] args) {
		new Solution().bulbSwitch(2);
	}
}