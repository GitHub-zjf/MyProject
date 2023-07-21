package sw.sw0056;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

	public int singleNumbers2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i = i + 3) {
			if (nums[i] != nums[i - 1]) {
				return nums[i - 1];
			}
		}
		return nums[nums.length - 1];
	}

	public int[] singleNumbers1(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int count = 0;
		int[] ret = new int[2];
		for (int key : map.keySet()) {
			if (1 == map.get(key)) {
				ret[count] = key;
				count++;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 9, 1, 7, 9, 7, 9, 7 };
		System.out.println(new Solution().singleNumbers2(nums));
	}
}