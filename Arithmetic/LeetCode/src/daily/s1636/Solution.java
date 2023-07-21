package daily.s1636;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			Integer count = map.getOrDefault(num, 0) + 1;
			map.put(num, count);
			list.add(num);
		}

		list.sort((a, b) -> {
			int aCount = map.get(a);
			int bCount = map.get(b);
			if (aCount == bCount) {
				return b - a;
			}
			return aCount - bCount;
		});

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 3, 1, 3, 2, 4 };
		int[] frequencySort = new Solution().frequencySort(nums);
		for (int f : frequencySort) {
			System.out.print(f + ",");
		}
	}
}