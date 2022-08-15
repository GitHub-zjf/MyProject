package s0477;

class Solution {
	public int totalHammingDistance(int[] nums) {
		int result = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				result = result + Integer.bitCount(nums[i] ^ nums[j]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 4, 14, 10 };
		int num = (2 ^ 4) + (2 ^ 14) + (4 ^ 14);
		System.out.println(Integer.bitCount(num));
//		System.out.println(new Solution().totalHammingDistance(nums));
	}
}