package daily.s1894;

class Solution {
	/**
	 *  ±©Á¦½â·¨
	 * @param chalk
	 * @param k
	 * @return
	 */
	public int chalkReplacer(int[] chalk, int k) {
		int len = chalk.length;
		int i = 0;
		while (true) {
			int c = chalk[i];
			if (k < chalk[i]) {
				break;
			}
			i++;
			if (i > len - 1) {
				i = 0;
			}
			k = k - c;
		}
		return i;
	}

	public static void main(String[] args) {
		int[] chalk = new int[] { 3, 4, 1, 2 };
		int k = 25;
		System.out.println(new Solution().chalkReplacer(chalk, k));
	}
	
	public int chalkReplacer2(int[] chalk, int k) {
		
		return 1;
	}	
}