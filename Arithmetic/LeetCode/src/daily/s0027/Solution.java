package daily.s0027;

public class Solution {
	public static int removeElement(int[] nums, int val) {
		int ans = 0;
		for (int num : nums) {
			if (num != val) {
				nums[ans] = num;
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(Solution.removeElement(nums, val));
	}
}