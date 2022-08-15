package s1768;

class Solution {

	public String mergeAlternately(String word1, String word2) {
		String word = "";
		char[] charArr1 = word1.toCharArray();
		int len1 = word1.length();
		char[] charArr2 = word2.toCharArray();
		int len2 = word2.length();
		int min = len1 <= len2 ? len1 : len2;
		for (int i = 0; i < min; i++) {
			word = word + charArr1[i] + charArr2[i];
		}
		word = word + word1.substring(min, len1);
		word = word + word2.substring(min, len2);
		return word;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().mergeAlternately("ab", "pqrs"));
	}

}