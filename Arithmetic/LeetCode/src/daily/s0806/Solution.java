package daily.s0806;

class Solution {
	public int[] numberOfLines(int[] widths, String s) {
		char[] charArray = s.toCharArray();
		// 行数
		int rows = 1;
		// 剩余单位长度
		int len = 0;
		for (int i = 0; i < charArray.length; i++) {
			len = len + widths[charArray[i] - 97];
//			if (len == 100 && i != charArray.length - 1) {
//				rows++;
//				len = 0;
//			}
			if (len > 100) {
				rows++;
				len = widths[charArray[i] - 97];
			}
		}
		return new int[] { rows, len };
	}

	public static void main(String[] args) {
		int[] widths = new int[] { 10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 };
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] numberOfLines = new Solution().numberOfLines(widths, s);
		System.out.println(numberOfLines[0] + " " + numberOfLines[1]);
	}
}