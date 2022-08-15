package s0290;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(new Solution().wordPattern(pattern, s));
	}
}