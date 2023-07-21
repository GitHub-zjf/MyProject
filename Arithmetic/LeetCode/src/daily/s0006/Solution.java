package daily.s0006;

class Solution {
	/*
	 * 二维数组，遍历字符串放到指定位置
	 */
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		String[] strs = s.split("");
		int len = strs.length;
		String result = "";
		String[][] strings = new String[numRows][len];
		int i = 0, j = 0, k = 0;
		boolean bool = false;
		while (len-- > 0) {
			strings[i][j] = strs[k];
			k++;
			if (bool) {
				i--;
				j = j + 1;
			} else {
				i++;
			}
			if (i == numRows - 1) {
				bool = true;
			}
			if (i == 0) {
				bool = false;
			}
		}

		for (String[] strs1 : strings) {
			for (String str : strs1) {
				if (null != str) {
					result += str;
				}
			}
		}
		return result;
	}

	public String convert2(String s, int numRows) {
		if (null == s || s.length() <= 0 || numRows <= 1) {
			return s;
		}
		StringBuilder[] builders = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			builders[i] = new StringBuilder();
		}
		int index = 0;
		int dir = 1;
		for (char c : s.toCharArray()) {
			builders[index].append(c);
			index = index + dir;
			if (index == 0 || index == numRows - 1)
				dir = -dir;
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			result.append(builders[i]);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		System.out.println(new Solution().convert2(str, 3));
	}
}