package s0978;

class Solution {
	public int maxTurbulenceSize(int[] arr) {
		int len = arr.length;
		int up = 1, down = 1;
		int ans = 1;
		for (int i = 1; i < len; i++) {
			if (arr[i] > arr[i - 1]) {
				up = down + 1;
				down = 1;
			} else if (arr[i] < arr[i - 1]) {
				down = up + 1;
				up = 1;
			} else {
				up = down = 1;
			}
			ans = Math.max(ans, Math.max(up, down));
		}
		return ans;
	}

	public static void main(String[] args) {
		// int[] arr = new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
		int[] arr = new int[] { 4, 8, 12, 16, 7, 8, 8, 1, 9 };
		System.out.println(new Solution().maxTurbulenceSize(arr));
	}
}