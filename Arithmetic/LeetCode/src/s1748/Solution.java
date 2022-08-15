package s1748;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 * 	请你返回 nums 中唯一元素的 和 。
 * @author zheng
 */
class Solution {
	public int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				sum += key;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
		System.out.println(new Solution().sumOfUnique(nums));
	}
}