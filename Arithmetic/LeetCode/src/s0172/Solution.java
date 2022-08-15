package s0172;
//给定一个整数 n，返回 n! 结果尾数中零的数量。
public class Solution {

	public int trailingZeroes(int n) {
		int result = 0;
		while (n != 0) {
			n = n / 5;			// 下一次的数
			result += n;		// 这一次包含多少个5
		}
		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.trailingZeroes(30));
	}
}