package s0470;

/**
 * The rand7() API is already defined in the parent class SolBase. public int
 * rand7();
 * 
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
	public int rand10() {
		SolBase solBase = new SolBase();
		int time = 10;
		int r = 0;
		while (time-- > 0) {
			r += solBase.rand7();
		}
		return r % 10 +1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		for (int i = 0; i < 10; i++) {
			System.out.println(solution.rand10());
		}
	}
}