package daily.s2404;

import java.util.*;

/**
 * 2404. 出现最频繁的偶数元素
 */
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        if (map.isEmpty()) {
            return -1;
        } else {
            int maxCount = 0;
            int min = Integer.MAX_VALUE;

            Set<Integer> keys = map.keySet();

            /** Integer maxCount2 = map.values().stream().max(Integer::max).get(); **/
            for (int k : keys) {
                maxCount = Math.max(maxCount, map.get(k));
            }

            for (int k : keys) {
                if (map.get(k) == maxCount) {
                    min = Math.min(min, k);
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{29, 47, 21, 41, 13, 37, 25, 7};
        System.out.println(new Solution().mostFrequentEven(nums));
    }
}