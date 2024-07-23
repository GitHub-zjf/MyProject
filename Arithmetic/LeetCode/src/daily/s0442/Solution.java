package daily.s0442;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. 数组中重复的数据
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int[] array = new int[nums.length + 1];
        for (int num : nums) {
            array[num]++;
            if (array[num] == 2) {
                result.add(num);
            }
        }
        return result;
    }
}