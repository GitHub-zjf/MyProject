package daily.s0448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] x = new int[n + 1];

        for (int num : nums) {
            x[num]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (x[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }

    /**
     * 不使用额外空间 list不算
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}