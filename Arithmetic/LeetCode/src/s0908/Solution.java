package s0908;

class Solution {
	public int smallestRangeI(int[] nums, int k) {
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}

		int diff = max - min;
		return diff <= 2 * k ? 0 : diff - 2 * k;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 10 };
		int k = 2;
		System.out.println(new Solution().smallestRangeI(nums, k));
	}
}