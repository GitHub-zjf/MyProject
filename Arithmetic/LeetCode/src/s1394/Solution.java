package s1394;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1394. 找出数组中的幸运数
 */
class Solution {
    public int findLucky(int[] arr) {
        int ret = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        Set<Integer> set = map.keySet();
        for (Integer s : set) {
            if (s.intValue() == map.get(s)) {
                ret = Math.max(s.intValue(), ret);
            }
        }

        return ret;
    }
}