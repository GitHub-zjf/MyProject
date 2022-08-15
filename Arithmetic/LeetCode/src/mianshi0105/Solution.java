package mianshi0105;

class Solution {
	public boolean oneEditAway(String first, String second) {
		int len1 = first.length();
		int len2 = second.length();
		if (len1 == len2) {
			// 长度相当，比较是否只有一个字符差异
			int diffCount = 0;
			for (int i = 0; i < len1; i++) {
				if (first.charAt(i) != second.charAt(i)) {
					diffCount++;
					if (diffCount > 1) {
						return false;
					}
				}
			}
			return true;
		} else if (len1 - len2 == 1) {
			return oneInsert(second, first);
		} else if (len1 - len2 == -1) {
			return oneInsert(first, second);
		} else {
			return false;
		}
	}

	public boolean oneInsert(String shorter, String longer) {
		int length1 = shorter.length(), length2 = longer.length();
		int index1 = 0, index2 = 0;
		while (index1 < length1 && index2 < length2) {
			if (shorter.charAt(index1) == longer.charAt(index2)) {
				index1++;
			}
			index2++;
			if (index2 - index1 > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String first = "pale", second = "ple";
		System.err.println(new Solution().oneEditAway(first, second));
	}
}