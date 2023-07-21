package daily.s0171;

class Solution {

	public int titleToNumber(String columnTitle) {
		char[] chars = columnTitle.toCharArray();
		int count = 0;
		int multiple = 1;
		for (int i = chars.length - 1; i >= 0; i--) {
			int k = chars[i] - 'A' + 1;
			count = count + k * multiple;
			multiple = multiple * 26;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().titleToNumber("ABZ"));
	}
}