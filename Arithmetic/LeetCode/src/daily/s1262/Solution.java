package daily.s1262;

import java.util.PriorityQueue;

/**
 * 1262. 可被三整除的最大和
 */
class Solution {
    public int maxSumDivThree(int[] nums) {
        // 使用优先队列减少排序，降低时间复杂度
        // 余数为1的数字
        PriorityQueue<Integer> one = new PriorityQueue<>();
        // 余数为2的数字
        PriorityQueue<Integer> two = new PriorityQueue<>();

        int sum = 0;
        for (int num : nums) {
            if (num % 3 == 1) {
                one.offer(num);
            }
            if (num % 3 == 2) {
                two.offer(num);
            }
            sum += num;
        }

        if (sum % 3 == 0) {
            return sum;
        }

        // 如果余数为1，从one中拿走一个，或者从two中拿走两个
        int ans1 = 0, ans2 = 0;
        if (sum % 3 == 1) {
            if (one.size() > 0) {
                ans1 = sum - one.poll();
            }
            if (two.size() > 1) {
                ans2 = sum - two.poll() - two.poll();
            }
            return Math.max(ans1, ans2);
        }
        // 如果余数为2，从one中拿走两个，或者从two中拿走一个
        if (sum % 3 == 2) {
            if (one.size() > 1) {
                ans1 = sum - one.poll() - one.poll();
            }
            if (two.size() > 0) {
                ans2 = sum - two.poll();
            }
            return Math.max(ans1, ans2);
        }

        return 0;
    }
}