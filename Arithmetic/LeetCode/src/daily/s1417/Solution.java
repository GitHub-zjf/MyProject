package daily.s1417;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        char[] chars = s.toCharArray();

        List<Character> charList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for (char c : chars) {
            if (97 <= c && c <= 122) {
                charList.add(c);
            } else {
                numList.add(c - '0');
            }
        }
        int len1 = charList.size();
        int len2 = numList.size();
        if (Math.abs(len1 - len2) <= 1) {
            StringBuilder sb = new StringBuilder();
            if (len1 == len2) {
                for (int i = 0; i < len1; i++) {
                    sb.append(charList.get(i));
                    sb.append(numList.get(i));
                }
            } else if (len1 < len2) {
                int i = 0;
                for (; i < len1; i++) {
                    sb.append(numList.get(i));
                    sb.append(charList.get(i));
                }
                sb.append(numList.get(i));
            } else {
                int i = 0;
                for (; i < len2; i++) {
                    sb.append(charList.get(i));
                    sb.append(numList.get(i));
                }
                sb.append(charList.get(i));
            }
            return sb.toString();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reformat("a0b1c2"));
    }
}