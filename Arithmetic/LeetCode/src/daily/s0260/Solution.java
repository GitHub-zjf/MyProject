package daily.s0260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * ֻ����һ�ε����� III
 * 
 * @author zheng
 * 
 *         ����һ���������� nums������ǡ��������Ԫ��ֻ����һ�Σ���������Ԫ�ؾ��������Ρ� �ҳ�ֻ����һ�ε�������Ԫ�ء�����԰� ����˳��
 *         ���ش𰸡�
 */
class Solution {

	//ִ�н����ͨ��
	//ִ����ʱ��6 ms, ������ Java �ύ�л�����13.91%���û�
	//�ڴ����ģ�38.8 MB, ������ Java �ύ�л�����26.18%���û�
	public int[] singleNumber(int[] nums) {
		if (nums.length <= 2) {
			return nums;
		}
		Arrays.sort(nums);
		Stack<Integer> stack = new Stack<>();
		stack.push(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if (stack.isEmpty()) {
				stack.push(nums[i]);
			} else if (nums[i] == stack.peek()) {
				stack.pop();
			} else {
				stack.push(nums[i]);
			}
		}
		
		int[] result = new int[2];
		result[0] = stack.get(0);
		result[1] = stack.get(1);
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 1, 3, 2, 5, 4, 4 };
		int[] singleNumber = new Solution().singleNumber(nums);
		for (int num : singleNumber) {
			System.out.print(num + " ");
		}
	}

	// ִ�н����ͨ��
	// ִ����ʱ��11 ms, ������ Java �ύ�л�����8.51%���û�
	// �ڴ����ģ�39.8 MB, ������ Java �ύ�л�����6.83%���û�
	public int[] singleNumber2(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				result.add(key);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}