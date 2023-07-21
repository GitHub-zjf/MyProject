package daily.s2154;

import java.util.HashMap;
import java.util.Map;

/**
 *  2154. 将找到的值乘以 2
 */
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int num : nums) {
            map.put(num, num);
        }
        while (map.get(original) != null) {
            original *= 2;
        }
        return original;
    }
}