package daily.s1005;

class Solution {
	public int largestSumAfterKNegations(int[] nums, int k) {
		int sum = 0;

		for (int i = 0; i < k; i++) {
			int min = nums[0];
			int minindex = 0;
			for (int j = 1; j < nums.length; j++) {
				if (nums[j] < min) {
					min = nums[j];
					minindex = j;
				}
			}
			nums[minindex] = nums[minindex] * -1;
		}

		for (int num : nums) {
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 2, 3 };
		int k = 1;
		System.out.println(new Solution().largestSumAfterKNegations(nums, k));
	}
}