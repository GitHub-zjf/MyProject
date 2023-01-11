package s1399;

import java.util.*;

/**
 * 1399. 统计最大组的数目
 */
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(max, map.get(sum));
        }
        int count = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countLargestGroup(10000));
    }
}