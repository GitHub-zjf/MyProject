package daily.s2605;

import java.util.*;

/**
 * @author zhengjingfeng
 * 2605. 从两个数字数组里生成最小数字
 */
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        // 判断是否有相同的数字
        int s = same(nums1, nums2);
        if (s != -1) {
            return s;
        }
        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();
        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }

    public int same(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        int x = 10;
        for (int i : nums2) {
            if (set.contains(i)) {
                x = Math.min(x, i);
            }
        }

        return x == 10 ? -1 : x;
    }
}