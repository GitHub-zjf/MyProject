package daily.s0136;
/*	只出现一次的数字 I
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 异或：相同为0，不同为1
 */
public class Solution {
	public int singleNumber(int[] nums) {
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 4, 1, 2, 1, 2 };
		System.out.println(solution.singleNumber(nums));
	}
}