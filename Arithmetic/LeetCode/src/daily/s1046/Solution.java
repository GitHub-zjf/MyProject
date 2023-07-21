package daily.s1046;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *  1046. 最后一块石头的重量
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(30, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < len; i++) {
            queue.offer(stones[i]);
        }
        while (queue.size() > 1) {
            Integer first = queue.poll();
            Integer second = queue.poll();
            int temp = Math.abs(first - second);
            if (temp != 0) {
                queue.offer(temp);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

    public static void main(String[] args) {
        int[] stones = new int[]{2, 2};
        System.out.println(new Solution().lastStoneWeight(stones));
    }
}