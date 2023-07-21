package daily.s1827;

class Solution {
	public int minOperations(int[] nums) {
		int times = 0;
		int len = nums.length;
		if (len <= 1) {
			return times;
		}
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[i] + 1;
				times = times + Math.abs(nums[i + 1] - temp);
			}
		}
		return times;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 5, 2, 4, 1 };
		System.out.println(new Solution().minOperations(nums));
	}
}