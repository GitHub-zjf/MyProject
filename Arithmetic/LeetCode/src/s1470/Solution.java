package s1470;

class Solution {
	public int[] shuffle(int[] nums, int n) {
		int[] rets = new int[2 * n];
		int left = 0;
		int right = n;
		int i = 0;
		while (left < n) {
			rets[i] = nums[left];
			rets[i + 1] = nums[right];
			left++;
			right++;
			i += 2;
		}
		return rets;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		new Solution().shuffle(nums, n);
	}
}