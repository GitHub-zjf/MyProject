package daily.s2341;

import java.util.HashMap;
import java.util.Map;

/**
 * 2341. 数组能形成多少数对
 */
class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) % 2 == 0) {
                count++;
            }
        }
        return new int[]{count, nums.length - count * 2};
    }
}