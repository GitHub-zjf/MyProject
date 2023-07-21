package daily.s0066;

import java.util.Arrays;

/*
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�����Լ���������� 0 ֮�⣬��������������㿪ͷ��
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