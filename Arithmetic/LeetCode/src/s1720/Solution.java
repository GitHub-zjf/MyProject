package s1720;

class Solution {
	public int[] decode(int[] encoded, int first) {
		int len = encoded.length;
		int[] ret = new int[len + 1];
		ret[0] = first;

		for (int i = 1; i < len + 1; i++) {
			ret[i] = ret[i - 1] ^ encoded[i - 1];
		}

		return ret;
	}
}