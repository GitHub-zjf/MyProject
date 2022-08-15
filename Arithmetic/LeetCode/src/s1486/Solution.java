package s1486;

/**
 * ��������������n �� start �� ���� nums ����Ϊ��nums[i] = start + 2*i���±�� 0 ��ʼ���� n ==
 * nums.length �� �뷵�� nums ������Ԫ�ذ�λ���XOR����õ��Ľ����
 * 
 * @author zheng
 *
 */
class Solution {
	public int xorOperation(int n, int start) {
		int result = start;
		for (int i = 1; i < n; i++) {
			result ^= start + 2 * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().xorOperation(5, 0));
	}
}