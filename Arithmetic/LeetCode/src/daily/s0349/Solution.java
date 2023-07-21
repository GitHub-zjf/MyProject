package daily.s0349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < len2; i++) {
			int tempNum = nums2[i];
			int left = 0;
			int right = len1 - 1;
			int mid = 0;
			while (left <= right) {
				mid = left + (right - left) / 2;
				if (nums1[mid] == tempNum) {
					set.add(tempNum);
					break;
				} else if (nums1[mid] > tempNum) {
					right = mid - 1;
				} else if (nums1[mid] < tempNum) {
					left = mid + 1;
				}
			}
		}
		return set.stream().mapToInt(k -> k).toArray();
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 4, 9, 5 };
		int[] nums2 = new int[] { 9, 4, 9, 8, 4 };

		int[] ret = new Solution().intersection(nums1, nums2);
		for (int r : ret) {
			System.out.println(r);
		}

	}
}