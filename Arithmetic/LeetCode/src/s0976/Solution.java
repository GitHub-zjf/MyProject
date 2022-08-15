package s0976;

import java.util.Arrays;

class Solution {
	public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = len - 1; i >= 2; i--) {
			if (nums[i - 2] + nums[i - 1] > nums[i]) {
				return nums[i - 2] + nums[i - 1] + nums[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 6, 2, 3 };
		System.out.println(new Solution().largestPerimeter(nums));
	}
}