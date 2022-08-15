package s1662;

class Solution {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		/**
		StringBuffer word_one = new StringBuffer();
		StringBuffer word_two = new StringBuffer();

		for (String word : word1) {
			word_one.append(word);
		}
		for (String word : word2) {
			word_two.append(word);
		}

		return word_one.toString().equals(word_two.toString());
		**/
		return String.join("", word1).toString().equals(String.join("", word2));
	}

	public static void main(String[] args) {
		String[] word1 = new String[] { "ab", "cd" };
		String[] word2 = new String[] { "a", "bcd" };
		System.out.println(new Solution().arrayStringsAreEqual(word1, word2));
	}
}