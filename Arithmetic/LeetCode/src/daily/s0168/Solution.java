package daily.s0168;

class Solution {
	public String convertToTitle(int columnNumber) {
		StringBuffer result = new StringBuffer();
		while (columnNumber != 0) {
			int remainer = columnNumber % 26;
			if (remainer == 0) {
				remainer = 26;
				columnNumber = columnNumber - 26;
			}
			char x = (char) (remainer + 64);
			result.append(x);
			columnNumber = columnNumber / 26;
		}
		return result.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(new Solution().convertToTitle(52));
	}
}