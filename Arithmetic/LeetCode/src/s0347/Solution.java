package s0347;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;

		for (int num : nums) {
			int count = map.getOrDefault(map.get(num), 0) + 1;
			map.put(num, count);
			max = (max >= count) ? max : count;
		}
		
		

		return null;
	}
	
	
}