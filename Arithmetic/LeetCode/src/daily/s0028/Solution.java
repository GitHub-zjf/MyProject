package daily.s0028;

class Solution {
	public int strStr(String haystack, String needle) {
		int hayLen = haystack.length();
		int needLen = needle.length();
		if (needLen == 0)
			return 0;
		for (int i = 0; i < (hayLen - needLen + 1); i++) {
			String temp = haystack.substring(i, i + needLen);
			if (temp.equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().strStr("aaa", "a"));
	}
}