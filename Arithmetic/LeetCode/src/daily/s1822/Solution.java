package daily.s1822;

/**
 * 1822. ����Ԫ�ػ��ķ���
 */
class Solution {
    public int arraySign(int[] nums) {
        // ͳ��С��0�ĸ���
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}