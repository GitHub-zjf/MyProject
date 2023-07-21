package daily.s0804;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		String[] str = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		Set<String> set = new HashSet<>();
		for (String word : words) {
			String temp = "";
			for (int i = 0; i < word.length(); i++) {
				temp += str[word.charAt(i) - 97];
			}
			System.out.println(temp);
			set.add(temp);
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] words = new String[] { "rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn" };
		System.out.println(new Solution().uniqueMorseRepresentations(words));
	}
}