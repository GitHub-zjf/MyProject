package s1716;

/**
 * 计算力扣银行的钱
 * 
 * @author zheng 最开始，他在周一的时候存入 1 块钱。从周二到周日，他每天都比前一天多存入 1 块钱。在接下来每一个周一，他都会比 前一个周一
 *         多存入 1 块钱。 给你 n ，请你返回在第 n 天结束的时候他在力扣银行总共存了多少块钱。
 */
class Solution {
	public int totalMoney(int n) {
		int sum = 0;
		int x = n / 7;
		int y = n % 7;
		if (x != 0) {
			sum = sum + (x * (x + 7) * 7) / 2;
		}
		if (y != 0) {
			x = x + 1;
			sum = sum + y * x + (y * (y - 1)) / 2;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().totalMoney(10));
	}
}