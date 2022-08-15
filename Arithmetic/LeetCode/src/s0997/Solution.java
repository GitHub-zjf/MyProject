package s0997;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int findJudge(int n, int[][] trust) {
		if (trust.length < 1){
			if(n<=1){
				return 1;
			}else{
				return -1;
			}
		}
		// 记录信任人的数量
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		// 记录被信任人的数量
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		int len = trust.length;
		for (int i = 0; i < len; i++) {
			int temp1 = trust[i][0];
			int temp2 = trust[i][1];
			map1.put(temp1, map1.getOrDefault(temp1, 0) + 1);
			map2.put(temp2, map2.getOrDefault(temp2, 0) + 1);
		}

		// 在信任中人没有 -- 说明他不相信任何人
		// 在被信任人中的数量等于 人数-1 -- 说明他被n-1(除了他自己信任)
		for (int i = 1; i <= n; i++) {
			Integer int1 = map1.get(i);
			Integer int2 = map2.get(i);
			if (null == int1 && int2 != null && int2 == (n - 1)) {
				return i;
			}
		}
		return -1;
	}
}