package daily.s1588;

class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int len = arr.length;
		int tempTen = len;
		int ret = 0;
		if (len % 2 == 0) {
			tempTen = len - 1;
		}

		while (tempTen > 0) {
			int sum = 0;

			int size = len - tempTen + 1;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < tempTen; j++) {
					sum = sum + arr[i + j];
				}
			}

			ret = ret + sum;
			tempTen = tempTen - 2;
		}

		return ret;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 11, 12 };
		System.out.println(new Solution().sumOddLengthSubarrays(arr));
	}
}