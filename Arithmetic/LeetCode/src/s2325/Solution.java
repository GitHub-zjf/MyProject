package s2325;

import java.util.HashMap;
import java.util.Map;

/**
 * 2325. ½âÃÜÏûÏ¢
 */
class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>(27);
        map.put(' ', ' ');
        char x = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, x);
                x++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(map.get(message.charAt(i)));
        }
        return sb.toString();
    }
}