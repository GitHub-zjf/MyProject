package s0264;

import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        set.add(1L);
        priorityQueue.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long cur = priorityQueue.poll();
            ugly = (int) cur;
            for (int factor : factors) {
                long next = factor * cur;
                if (set.add(next)) {
                    priorityQueue.offer(next);
                }
            }
        }
        return ugly;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(1690));
    }
}