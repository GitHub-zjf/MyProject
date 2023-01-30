package s2155;

import java.util.ArrayList;
import java.util.List;

/**
 *  2155. 分组得分最高的所有下标
 */
class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // 记录左半区的分数
        int left = 0;
        // 记录右半区的分数
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
            // 如果大于最大值，清空原有的，重新添加
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