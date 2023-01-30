package s2155;

import java.util.ArrayList;
import java.util.List;

/**
 *  2155. ����÷���ߵ������±�
 */
class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // ��¼������ķ���
        int left = 0;
        // ��¼�Ұ����ķ���
        int right = 0;
        for (int num : nums) {
            if (num == 1) {
                right++;
            }
        }
        int max = left + right;
        list.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                left++;
            }
            if (nums[i] == 1) {
                right--;
            }
            int sum = left + right;
            // ����������ֵ�����ԭ�еģ��������
            if (sum > max) {
                list.clear();
                list.add(i + 1);
                max = sum;
            } else if (sum == max) {
                list.add(i + 1);
            }
        }
        return list;
    }
}