package daily.s0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 15. ����֮��
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new LinkedHashSet<>();
        // ���� + ˫ָ��
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int first = nums[i];
            // �����ǰ�ĵ�һ��������0���������򣬺��������������ܵ���0
            if (first > 0) {
                break;
            }
            int left = i + 1, right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + first;
                if (sum == 0) {
                    set.add(Arrays.asList(nums[left], nums[right], first));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, -2, -1, 1, 2};
        new Solution().threeSum(nums);
    }
}