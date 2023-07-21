package daily.s1551;
/**
 * 	����һ������Ϊ n ������ arr ������ arr[i] = (2 * i) + 1 �� 0 <= i < n ����
	һ�β����У������ѡ�������±꣬���� x �� y �� 0 <= x, y < n ����ʹ arr[x] ��ȥ 1 ��arr[y] ���� 1 ���� arr[x] -=1 �� arr[y] += 1 ����
	���յ�Ŀ����ʹ�����е�����Ԫ�ض� ��� ����Ŀ������������ ��֤ ����ִ�����ɲ������������е�����Ԫ�����տ���ȫ����ȡ�
	����һ������ n��������ĳ��ȡ����㷵��ʹ���� arr ������Ԫ���������� ��С������ ��
 * @author zheng
 *
 */
class Solution {
	public int minOperations(int n) {
		int m = (int) Math.ceil(n / 2.0);
		return m * (n - m);
		/**
		 *    m * (n - m) 
		 * = (n/2) * (n - n/2) 
		 * = (n/2) * (n/2)
		 * = n * n / 4
		 */
	}

	public int minOperations2(int n) {
		int ret = 0;
		int m = n / 2;
		for (int i = 0; i < m; i++) {
			ret = ret + (n - (2 * i + 1));
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().minOperations2(8));
	}
}