package s0205;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Í¬¹¹×Ö·û´®
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cs = s.charAt(i);
            char ts = t.charAt(i);
            if ((mapS.containsKey(cs) && mapS.get(cs) != ts) || (mapT.containsKey(ts) && mapT.get(ts) != cs)) {
                return false;
            } else {
                mapS.put(cs, ts);
                mapT.put(ts, cs);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
    }
}