package daily.s0137;

import java.util.Arrays;

/*	ֻ����һ�ε����� II
 * ����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ�����3�Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
 * �����ͬΪ0����ͬΪ1
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