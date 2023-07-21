package daily.s0350;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}