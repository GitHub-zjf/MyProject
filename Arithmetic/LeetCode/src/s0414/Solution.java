package s0414;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 414. ���������
 */
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int thirdMax = nums[nums.length - 1];
        // ��¼���������˶��ٴ�
        int maxCount = 2;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < thirdMax && maxCount > 0) {
                thirdMax = nums[i];
                maxCount--;
            }
        }

        if (maxCount > 0) {
            return nums[nums.length - 1];
        }

        return thirdMax;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 5, 3, 5};
        System.out.println(new Solution().thirdMax(nums));
    }
}