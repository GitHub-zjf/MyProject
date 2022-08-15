package s0035;

class Solution {
	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid + 1;
			}
		}

		return left;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 0;
		System.out.println(new Solution().searchInsert(nums, target));
	}
}