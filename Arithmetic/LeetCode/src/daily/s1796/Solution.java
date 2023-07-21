package daily.s1796;

import java.util.HashSet;
import java.util.Set;

/**
 *  1796. 字符串中第二大的数字
 */
class Solution {
    /**
     * @date 20210416
     * @param s
     * @return
     */
    public int secondHighest(String s) {
        char[] cs = s.toCharArray();
        Set<Integer> set = new HashSet<>();
        for (char c : cs) {
            if (Character.isDigit(c)) {
                set.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        int size = set.size();
        if (size > 1) {
            return set.toArray(new Integer[0])[size - 2];
        }
        return -1;
    }

    /**
     *
     * @param s
     * @date 20221205
     * @return
     */
    public int secondHighest2(String s) {
        int first = -1, second = -1;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            if (Character.isDigit(c)) {
                int temp = c - '0';
                if (temp > second && temp < first) {
                    second = temp;
                }
                if (temp > first) {
                    second = first;
                    first = temp;
                }
            }
        }
        return second;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().secondHighest("ck077"));
    }
}