package daily.s1262;

import java.util.PriorityQueue;

/**
 * 1262. �ɱ�������������
 */
class Solution {
    public int maxSumDivThree(int[] nums) {
        // ʹ�����ȶ��м������򣬽���ʱ�临�Ӷ�
        // ����Ϊ1������
        PriorityQueue<Integer> one = new PriorityQueue<>();
        // ����Ϊ2������
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

        // �������Ϊ1����one������һ�������ߴ�two����������
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
        // �������Ϊ2����one���������������ߴ�two������һ��
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