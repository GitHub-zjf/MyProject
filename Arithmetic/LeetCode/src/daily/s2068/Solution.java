package daily.s2068;

import java.util.HashMap;
import java.util.Map;

/**
 * 2068. 检查两个字符串是否几乎相等
 */
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int len = word1.length();
        Map<Character, Integer> map1 = new HashMap<>(len);
        Map<Character, Integer> map2 = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        for (char x = 'a'; x <= 'z'; x++) {
            int int1 = map1.getOrDefault(x, 0).intValue();
            int int2 = map2.getOrDefault(x, 0).intValue();
            if (Math.abs(int1 - int2) > 3) {
                return false;
            }
        }

        return true;
    }

    public boolean checkAlmostEquivalent2(String word1, String word2) {
        int[] count = new int[26];
        int len = word1.length();
        for (int i = 0; i < len; i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(count[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}