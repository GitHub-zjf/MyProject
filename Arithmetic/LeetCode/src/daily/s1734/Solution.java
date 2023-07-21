package daily.s1734;

class Solution {
	public int[] decode(int[] encoded) {
		int len = encoded.length + 1;
		int[] ret = new int[len];
		int total = 0;
		for (int i = 1; i <= len; i++) {
			total ^= i;
		}
		int odd = 0;
		for (int i = 1; i < len - 1; i = i + 2) {
			odd ^= encoded[i];
		}

		ret[0] = total ^ odd;

		for (int i = 1; i < len; i++) {
			ret[i] = ret[i - 1] ^ encoded[i - 1];
		}

		return ret;
	}
}