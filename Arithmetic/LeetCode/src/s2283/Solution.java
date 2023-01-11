package s2283;

import java.util.HashMap;
import java.util.Map;

/**
 *  2283. 判断一个数的数字计数是否等于数位的值
 */
class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';
            if (map.getOrDefault(i, 0) != n) {
                return false;
            }
        }
        return true;
    }
}