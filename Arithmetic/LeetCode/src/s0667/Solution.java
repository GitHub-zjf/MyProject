package s0667;

/**
 *  667. 优美的排列 II
 */
class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int idx = 0;
        for (int i = 1; i < n - k; i++) {
            ans[idx] = i;
            idx++;
        }
        for (int i = n - k, j = n; i <= j; i++, j--) {
            ans[idx] = i;
            idx++;
            if (i != j) {
                ans[idx] = j;
                idx++;
            }
        }
        return ans;
    }
}