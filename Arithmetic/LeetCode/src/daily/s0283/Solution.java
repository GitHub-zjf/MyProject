package daily.s0283;

class Solution {
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int zeroIndex = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] != 0) {
				nums[zeroIndex] = nums[i];
				zeroIndex++;
			}
		}

		for (int i = zeroIndex; i < len; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 0, 13, 0, 0, 2 };

		new Solution().moveZeroes(nums);

		for (int num : nums) {
			System.out.println(num);
		}

	}
}