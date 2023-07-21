package daily.s0643;

class Solution {

	public double findMaxAverage1(int[] nums, int k) {
		int avg = Integer.MAX_VALUE * -1;
		int end = nums.length - (k - 1);
		for (int i = 0; i < end; i++) {
			int temp = 0;
			for (int j = i, x = 0; x < k; x++, j++) {
				temp += nums[j];
			}
			avg = Math.max(avg, temp);
		}
		return avg / (k * 1.0);
	}

	// 听起来很高大上的 “滑动窗口”
	public double findMaxAverage2(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		int maxSum = sum;

		for (int i = k; i < nums.length; i++) {
			sum = sum - nums[i - k] + nums[i];
			maxSum = Math.max(sum, maxSum);
		}

		return 1.0 * maxSum / k;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 12, -5, -6, 50, 3, 70, -5, -90, 100, 200 };
		int k = 6;
		System.out.println(new Solution().findMaxAverage2(nums, k));

	}
}