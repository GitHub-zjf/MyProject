package interview_questions.s1709;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *  面试题 17.09. 第 k 个数
 */
class Solution {
    public int getKthMagicNumber(int k) {
        int[] factors = new int[]{3, 5, 7};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        set.add(1L);
        queue.offer(1L);
        int magic = 0;
        for (int i = 0; i < k; i++) {
            long poll = queue.poll();
            magic = (int) poll;
            for (int factor : factors) {
                long next = poll * factor;
                if (set.add(next)) {
                    queue.offer(next);
                }
            }
        }
        return magic;
    }
}