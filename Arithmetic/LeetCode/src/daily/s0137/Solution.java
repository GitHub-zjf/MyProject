package daily.s0137;

import java.util.Arrays;

/*	只出现一次的数字 II
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现3次。找出那个只出现了一次的元素。
 * 异或：相同为0，不同为1
 */
public class Solution {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);

		int length = nums.length;
		for (int i = 0; i < length - 1; i = i + 3) {
			if(nums[i] != nums[i+1] || nums[i+1] != nums[i+2]){
				return nums[i] ^ nums[i+1] ^ nums[i+2];
			}
		}

		return nums[length - 1];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 0,1,0,1,0,1,99 };
		System.out.println(solution.singleNumber(nums));
	}
}