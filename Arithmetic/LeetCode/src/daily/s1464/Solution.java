package daily.s1464;

import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int a = -1, b = -1;
        for (int n : nums) {
            if (n > a) {
                b = a;
                a = n;
            } else if (n > b) {
                b = n;
            }
        }
        return (a - 1) * (b - 1);
    }

    public int maxProduct2(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

}