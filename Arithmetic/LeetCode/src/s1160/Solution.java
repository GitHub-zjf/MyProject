package s1160;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160. Æ´Ð´µ¥´Ê
 */
class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char temp = chars.charAt(i);
            charMap.put(temp, charMap.getOrDefault(temp, 0) + 1);
        }
        int ans = 0;
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(i);
                wordMap.put(temp, wordMap.getOrDefault(temp, 0) + 1);
            }

            boolean isHave = true;
            for (int i = 0; i < word.length(); i++) {
                char temp = word.charAt(i);
                int countInChars = (int) charMap.getOrDefault(temp, 0);
                int countInWords = (int) wordMap.getOrDefault(temp, 0);
                if (countInChars == 0 || countInChars < countInWords) {
                    isHave = false;
                    break;
                }
            }

            if (isHave) {
                ans += word.length();
            }
        }

        return ans;
    }
}