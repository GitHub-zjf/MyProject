package daily.s1785;

/**
 * 1785. �����ض�����Ҫ��ӵ�����Ԫ��
 */
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long diff = Math.abs(sum - goal);
        // ����ȡ��
        return (int) Math.ceil((double) diff / limit);
    }
}