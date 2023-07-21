package daily.s1551;
/**
 * 	存在一个长度为 n 的数组 arr ，其中 arr[i] = (2 * i) + 1 （ 0 <= i < n ）。
	一次操作中，你可以选出两个下标，记作 x 和 y （ 0 <= x, y < n ）并使 arr[x] 减去 1 、arr[y] 加上 1 （即 arr[x] -=1 且 arr[y] += 1 ）。
	最终的目标是使数组中的所有元素都 相等 。题目测试用例将会 保证 ：在执行若干步操作后，数组中的所有元素最终可以全部相等。
	给你一个整数 n，即数组的长度。请你返回使数组 arr 中所有元素相等所需的 最小操作数 。
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