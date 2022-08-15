package s0001;

/*
 * ����һ����������nums��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ�����������������������ǵ������±ꡣ
 */
public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

	public int[] twoSum2(int[] nums, int target) {
		int len = nums.length - 1;

		int left = 0, right = 1;
		while (left < right) {
			if (nums[left] + nums[right] == target){
				break;
			}
			if (right == len) {
				left = left + 1;
				right = left + 1;
			} else {
				right++;
			}
		}

		return new int[] { left, right };
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2 };
		int target = 5;
		int[] twoSum2 = new Solution().twoSum2(nums, target);
		System.out.println(twoSum2[0] + "-" + twoSum2[1]);
	}
}
