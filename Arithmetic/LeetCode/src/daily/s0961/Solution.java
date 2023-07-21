package daily.s0961;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	public int repeatedNTimes1(int[] A) {
		int length = A.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) == length / 2) {
				return key;
			}
		}
		return 0;
	}

	public int repeatedNTimes2(int[] A) {
		int length = A.length;
		Arrays.sort(A);
		for (int i = 0; i < length - 1; i++) {
			if (A[i] == A[i + 1])
				return A[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 5, 1, 5, 2, 5, 3, 5, 4 };
		System.out.println(new Solution().repeatedNTimes2(A));
	}
}