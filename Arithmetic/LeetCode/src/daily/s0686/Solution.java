package daily.s0686;

class Solution {
	public int repeatedStringMatch(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int ans = 0;
		// 一个完整的B可能首部用到A的一部分，尾部用到A的一部分，像这样A'[AA....AA]A' , [ ]
		// 内必然<=B的长度，故总长<=2*A+B
		int max = 2 * aLen + bLen;
		String sb = "";
		while (sb.length() <= max) {
			sb = sb.concat(a);
			ans++;
			if (sb.indexOf(b) != -1) {
				return ans;
			}
		}
		return -1;
	}
}