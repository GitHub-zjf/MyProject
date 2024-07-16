package daily.s2956;

import java.util.HashMap;
import java.util.Map;

/**
 * 2956. 找到两个数组中的公共元素
 */
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int num1 : nums1) {
            map1.put(num1, num1);
        }
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int num2 : nums2) {
            map2.put(num2, num2);
        }
        for (int num1 : nums1) {
            if (map2.containsKey(num1)) {
                result[0]++;
            }
        }
        for (int num2 : nums2) {
            if (map1.containsKey(num2)) {
                result[1]++;
            }
        }
        return result;
    }
}