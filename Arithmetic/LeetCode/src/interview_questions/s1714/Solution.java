package interview_questions.s1714;

import java.util.Arrays;

class Solution {
	public int[] smallestK(int[] arr, int k) {
		Arrays.sort(arr);
		int[] ret = new int[k];
		for (int i = 0; i < k; i++) {
			ret[i] = arr[i];
		}
		return ret;
	}
}