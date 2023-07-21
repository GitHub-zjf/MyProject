package daily.s0026;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int left = 0;
		for (int right = 1; right < nums.length; right++) {
			if (nums[left] != nums[right]) {
				left += 1;
				nums[left] = nums[right];
			}
		}
		return ++left;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 0, 0, 3, 3 };
		int len = Solution.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.err.print(nums[i] + " ");
		}
	}
}