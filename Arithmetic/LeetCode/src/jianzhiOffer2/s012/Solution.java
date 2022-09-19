package jianzhiOffer2.s012;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int length = nums.length;
        int leftSum = 0, rightSum = sum - nums[0];
        if (leftSum == rightSum) {
            return 0;
        }
        for (int i = 1; i < length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int t = 0;
        for (int i = 0; i < len; i++) {
            if (2 * t + nums[i] == sum) {
                return i;
            }
            t = t + nums[i];
        }
        return -1;
    }
}