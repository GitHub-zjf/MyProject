package daily.s1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. ×îÐ¡¾ø¶Ô²î
 */
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}