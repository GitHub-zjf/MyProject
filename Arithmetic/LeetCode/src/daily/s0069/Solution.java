package daily.s0069;

/*
 *  ʵ�� int sqrt(int x) ������
	���㲢���� x ��ƽ���������� x �ǷǸ�������
	���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ
 */
public class Solution {
	public int mySqrt(int x) {
		// ע�⣺�������������������� 2147395599,Ҫ�������ķ�Χ���óɳ�����
		// Ϊ���չ˵� 0 ����߽�����Ϊ 0
		long left = 0;
		// Ϊ���չ˵� 1 ���ұ߽�����Ϊ x / 2 + 1
		long right = x / 2 + 1;
		while (left < right) {
			// ע�⣺����һ��ȡ����λ�������ȡ����λ��������������ѭ��
			// long mid = left + (right - left + 1) / 2;
			long mid = (left + right + 1) >>> 1;
			long square = mid * mid;
			if (square > x) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}
		// ��Ϊһ�����ڣ�����������
		return (int) left;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.mySqrt(8));
	}
}