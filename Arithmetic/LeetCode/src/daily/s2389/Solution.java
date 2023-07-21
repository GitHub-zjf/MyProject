package daily.s2389;

import java.util.Arrays;

/**
 * 2389. 和有限的最长子序列
 */
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int n = nums.length;

        Arrays.sort(nums);
        int[] sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }


        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = binarySearch(sums, queries[i]) - 1;
        }

        return ans;
    }

    public int binarySearch(int[] f, int target) {
        int low = 1, high = f.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (f[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}