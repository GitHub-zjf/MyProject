package s1408;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> retList = new ArrayList<>();
        int len = words.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (!retList.contains(words[j]) && words[i].length() > words[j].length() && words[i].contains(words[j])) {
                    retList.add(words[j]);
                }
            }
        }

        return retList;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"mass", "as", "hero", "superhero"};
        String[] words2 = new String[]{"leetcode", "et", "code"};
        String[] words3 = new String[]{"blue", "green", "bu"};
        List<String> ret = new Solution().stringMatching(words);
        ret.forEach(r -> System.out.println(r));
    }
}