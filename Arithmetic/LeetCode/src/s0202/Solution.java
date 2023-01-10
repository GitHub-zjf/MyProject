package s0202;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. ¿ìÀÖÊı
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            String s = String.valueOf(n);
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                int x = s.charAt(i) - '0';
                temp += x * x;
            }
            if (temp == 1) {
                return true;
            } else {
                n = temp;
                if (!set.add(n)) {
                    return false;
                }
            }
        }
    }
}