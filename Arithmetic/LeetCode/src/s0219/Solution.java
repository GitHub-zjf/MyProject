package s0219;

import java.util.HashSet;
import java.util.Set;

class Solution {

	// public boolean containsNearbyDuplicate(int[] nums, int k) {
	// int len = nums.length;
	// for (int i = 0; i < len; i++) {
	// for (int j = i + 1; j <= i + k && j < len; j++) {
	// if (nums[i] == nums[j]) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
			if (set.size() > k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 1 };
		int k = 97;
		System.out.println(new Solution().containsNearbyDuplicate(nums, k));
	}
}