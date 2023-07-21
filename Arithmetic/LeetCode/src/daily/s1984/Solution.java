package daily.s1984;

import java.util.Arrays;

class Solution {
	public int minimumDifference(int[] nums, int k) {
		int ret = Integer.MAX_VALUE;
		if (k <= 1) {
			return 0;
		}
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length - k; i++) {
			ret = Math.min(ret, nums[i + k - 1] - nums[i]);
		}
		return ret;
	}
}