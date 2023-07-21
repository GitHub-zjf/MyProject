package daily.s0066;

import java.util.Arrays;

/*
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。你可以假设除了整数 0 之外，这个整数不会以零开头。
 */

public class Solution {
	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		int tag = 1;
		int temp = 0;
		for (int i = len - 1; i >= 0; i--) {
			temp = digits[i] + tag;
			digits[i] = temp % 10;
			tag = temp / 10;
		}
		if (tag != 0) {
			digits = Arrays.copyOf(digits, len + 1);
			for (int i = len; i > 0; i--) {
				digits[i] = digits[i - 1];
			}
			digits[0] = tag;
		}
		return digits;
	}

	public static void main(String[] args) {
		int[] a = { 9, 9, 9 };
		int[] result = Solution.plusOne(a);
		for (int i : result) {
			System.out.print(i);
		}
	}
}