package s1403;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> retList = new LinkedList<>();

        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 结果集合中的和
        int retSum = 0;
        for (int i = len - 1; i >= 0; i--) {
            retSum += nums[i];
            sum -= nums[i];
            retList.add(nums[i]);
            if (retSum > sum) {
                break;
            }
        }

        return retList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 4, 7, 6, 7};
        new Solution().minSubsequence(nums).forEach(n -> System.out.println(n));
    }
}