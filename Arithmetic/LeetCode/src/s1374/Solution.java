package s1374;

class Solution {
	public String generateTheString(int n) {
		String ret = "";
		for (int i = 0; i < n - 1; i++) {
			ret += "a";
		}

		if (n % 2 == 0) {
			return ret += "b";
		} else {
			return ret += "a";
		}
	}
}