package s0172;
//����һ������ n������ n! ���β�������������
public class Solution {

	public int trailingZeroes(int n) {
		int result = 0;
		while (n != 0) {
			n = n / 5;			// ��һ�ε���
			result += n;		// ��һ�ΰ������ٸ�5
		}
		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.trailingZeroes(30));
	}
}