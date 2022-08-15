package s1935;

class Solution {
	public int canBeTypedWords(String text, String brokenLetters) {
		if (brokenLetters.length() >= 26) {
			return 0;
		}
		char[] brokenS = brokenLetters.toCharArray();
		String[] texts = text.split(" ");
		int count = texts.length;
		if (brokenLetters.length() == 0) {
			return texts.length;
		}
		for (String te : texts) {
			for (char c : brokenS) {
				if (te.indexOf(c) != -1) {
					count--;
					break;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String text = "leet code";
		String brokenLetters = "e";
		System.out.println(new Solution().canBeTypedWords(text, brokenLetters));
	}
}