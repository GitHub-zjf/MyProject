package s0852;

class Solution {
	public int peakIndexInMountainArray(int[] arr) {
//		int len = arr.length;
//		for (int i = 1; i < len - 1; i++) {
//			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
//				return i;
//			}
//		}
//		return 0;
		int n = arr.length;
		int left = 1, right = n - 2, ans = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] > arr[mid + 1]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
		System.out.println(new Solution().peakIndexInMountainArray(arr));
	}
}