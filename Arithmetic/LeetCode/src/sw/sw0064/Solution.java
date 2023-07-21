package sw.sw0064;

class Solution {
	int[] test = new int[] { 0 };

	public int sumNums(int n) {
		// 利用数组越界来中止程序
		try {
			return test[n];
		} catch (Exception e) {
			return n + sumNums(n - 1);
		}
	}

	public int sumNums2(int n) {
		// 利用逻辑断路来中止程序
		boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
		return n;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().sumNums(10000));
	}
}