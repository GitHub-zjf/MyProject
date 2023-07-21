package daily.s0136;
/*	ֻ����һ�ε����� I
 * ����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
 * �����ͬΪ0����ͬΪ1
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