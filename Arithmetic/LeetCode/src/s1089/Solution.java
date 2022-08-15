package s1089;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public void duplicateZeros(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len;) {
			if (arr[i] == 0) {
				for (int j = len - 1; j > i; j--) {
					arr[j] = arr[j - 1];
				}
				i += 2;
			} else {
				i += 1;
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 4, 1, 0, 0, 8, 0, 0, 3 };
		new Solution().duplicateZeros2(arr);
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}

	public void duplicateZeros2(int[] arr) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i : arr) {
			sBuffer.append(i);
		}
		String s = sBuffer.toString().replace("0", "00");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i) - '0';
		}
	}
}