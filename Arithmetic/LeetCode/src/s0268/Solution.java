package s0268;

class Solution {
	public int missingNumber(int[] nums) {
		int len = nums.length;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < len; i++) {
			sum1 = sum1 + nums[i];
			sum2 = sum2 + (i + 1);
		}
		return sum2 - sum1;
	}
}