package s0169;

import java.util.HashMap;
import java.util.Map;

/*
 * ÇóÖÚÊı
 */

class Solution {
	public int majorityElement(int[] nums) {
		int len = nums.length;
		if (len <= 2) {
			return nums[0];
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int key : map.keySet()) {
			if (map.get(key) > len / 2) {
				return key;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3 };
		System.out.println(new Solution().majorityElement(nums));
	}
}