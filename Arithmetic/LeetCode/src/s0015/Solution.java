package s0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
// 夭折
class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		int len = nums.length;
		if (len < 3) {
			return new ArrayList<>();
		}
		Set<String> set = new LinkedHashSet<>();
		// 存储两数之和
		Map<int[], Integer> map = new HashMap<int[], Integer>();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i != j) {
					int[] ints = new int[] { i, j };
					map.put(ints , nums[i] + nums[j] );
				}
			}
		}
		// 寻找相反数
		for (int i = 0; i < len; i++) {
			Set<int[]> keySet = map.keySet();
			for (int[] key : keySet) {
				int value = map.get(key);
				if (nums[i] + value == 0) {
					if (i != key[0] && i != key[1]) {
						int[] temp = new int[] { nums[i], nums[key[0]], nums[key[1]] };
						Arrays.sort(temp);
						set.add(temp[0] + ":" + temp[1] + ":" + temp[2]);
					}
				}
			}
		}
		List<List<Integer>> list = new ArrayList<>();
		for (String s : set) {
			String[] split = s.split(":");
			List<Integer> list2 = new ArrayList<>();
			list2.add(Integer.parseInt(split[0]));
			list2.add(Integer.parseInt(split[1]));
			list2.add(Integer.parseInt(split[2]));
			list.add(list2);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 0, -2, -1, 1, 2 };
		new Solution().threeSum(nums);
	}
}