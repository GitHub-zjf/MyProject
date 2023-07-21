package daily.s2200;

import java.util.*;

/**
 * @author zhengjianfeng
 * @description 2200. 找出数组中的所有 K 近邻下标
 */
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                set.add(i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (Integer integer : set) {
                if (Math.abs(i - integer) <= k) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}