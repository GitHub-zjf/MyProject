package daily.s0260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * 只出现一次的数字 III
 * 
 * @author zheng
 * 
 *         给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序
 *         返回答案。
 */
class Solution {

	//执行结果：通过
	//执行用时：6 ms, 在所有 Java 提交中击败了13.91%的用户
	//内存消耗：38.8 MB, 在所有 Java 提交中击败了26.18%的用户
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

	// 执行结果：通过
	// 执行用时：11 ms, 在所有 Java 提交中击败了8.51%的用户
	// 内存消耗：39.8 MB, 在所有 Java 提交中击败了6.83%的用户
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