package daily.s1313;

/**
 * 
 * @author zheng 给你一个以行程长度编码压缩的整数列表 nums 。
 * 
 *         考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），
 *         每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * 
 *         请你返回解压后的列表。
 */
public class Solution {
	public int[] decompressRLElist(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			count += nums[i];
		}
		int[] result = new int[count];
		int k = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			for (int j = 0; j < nums[i]; j++) {
				result[k] = nums[i + 1];
				k++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 2 };
		int[] decompressRLElist = new Solution().decompressRLElist(nums);
		for (int i : decompressRLElist) {
			System.out.print(i + " ");
		}
	}
}