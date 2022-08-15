package s0944;

class Solution {
	public int minDeletionSize(String[] strs) {
		int ret = 0;
		int length = strs[0].length();
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < strs.length - 1; i++) {
				if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
					ret++;
					break;
				}
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		String[] strs = new String[] { "zyx", "wvu", "tsr" };
		System.out.println(new Solution().minDeletionSize(strs));
	}
}