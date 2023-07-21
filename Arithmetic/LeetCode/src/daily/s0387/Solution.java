package daily.s0387;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Set<Character> keys = map.keySet();
        for (char key : keys) {
            if (map.get(key) == 1) {
                return s.indexOf(key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aabb"));
    }
}