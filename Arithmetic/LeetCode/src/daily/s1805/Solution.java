package daily.s1805;

import java.util.HashSet;
import java.util.Set;

/**
 *  1805. 字符串中不同整数的数目
 */
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        String[] nums = word.replaceAll("\\D", " ").split(" +");
        for (String num : nums) {
            if (!num.trim().equals("")) {
                while (num.indexOf("0") == 0) {
                    num = num.substring(1);
                }
                set.add(num);
            }
        }
        return set.size();
    }

}