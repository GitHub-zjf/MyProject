package jian_zhi_offer.II.s0057;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengjianfeng
 * @description 剑指 Offer 57. 和为s的两个数字
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num > target) {
                break;
            }
            map.put(target - num, num);
        }

        for (int num : nums) {
            if (map.get(num) != null) {
                result[0] = num;
                result[1] = map.get(num);
            }
        }

        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 先找出right的位置
        while (left <= right) {
            int middle = left + right;
            if (nums[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        left = 0;
        while (left < right) {
//            if (nums[right] > target) {
//                right--;
//                continue;
//            }
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{nums[left], nums[right]};
    }

}