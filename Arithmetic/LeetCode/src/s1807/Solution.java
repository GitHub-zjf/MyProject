package s1807;

import java.util.*;

/**
 * 1807. Ìæ»»×Ö·û´®ÖÐµÄÀ¨ºÅÄÚÈÝ
 */
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>(knowledge.size());
        for (List<String> k : knowledge) {
            map.put(k.get(0), k.get(1));
        }
        boolean addKey = false;
        StringBuilder key = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                addKey = true;
            } else if (c == ')') {
                res.append(map.getOrDefault(key.toString(), "?"));
                addKey = false;
                key.setLength(0);
            } else {
                if (addKey) {
                    key.append(c);
                } else {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "n(h)a";
        List<List<String>> knowledge = new ArrayList<List<String>>() {{
            add(Arrays.asList("a", "yes"));
        }};
        System.out.println(new Solution().evaluate(s, knowledge));
    }
}