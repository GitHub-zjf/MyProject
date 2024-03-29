package daily.s0650;

/**
 * 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作： Copy All (复制全部) :
 * 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。 Paste (粘贴) : 你可以粘贴你上一次复制的字符。
 * 给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
 */
class Solution {
	// 如果是素数，返回原数字，复制一次，粘贴n-1次
	// 如果是合数，使用递归 36 = 2 * 2 * 3 * 3， 10次
	public int minSteps(int n) {
		if (n == 1) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return i + minSteps(n / i);
			}
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().minSteps(741));
	}
}