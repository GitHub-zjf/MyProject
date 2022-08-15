package s0088;

import java.util.Arrays;

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = new int[] { 2, 5, 6 };
		int n = 3;
		new Solution().merge(nums1, m, nums2, n);

		for (int i : nums1) {
			System.out.print(i + " ");
		}
	}
}