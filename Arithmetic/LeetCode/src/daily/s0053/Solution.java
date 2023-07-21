package daily.s0053;

class Solution {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(new Solution().maxSubArray(nums));
	}
}