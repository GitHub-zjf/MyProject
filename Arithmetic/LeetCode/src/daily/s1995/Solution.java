package daily.s1995;

class Solution {
	public int countQuadruplets(int[] nums) {
		int count = 0;

		int len = nums.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					for (int l = k + 1; l < len; l++) {
						if (nums[i] + nums[j] + nums[k] == nums[l]) {
							count++;
						}
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 1, 3, 5, 1, 1, 1, 3, 5, 1, 1, 1, 3, 5, 1, 1, 1, 3, 5, 1, 1, 1, 3, 5 };
		System.out.println(new Solution().countQuadruplets(nums));
	}
}