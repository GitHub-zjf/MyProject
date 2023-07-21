package daily.s0832;

class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		// 首先翻转每一行
		for (int[] a : A) {
			int length = a.length;
			for (int i = 0; i < length / 2; i++) {
				int temp = a[i];
				a[i] = a[length - 1 - i];
				a[length - 1 - i] = temp;
			}
		}

		// 然后反转图片
		for (int i = 0; i < A.length; i++) {
			int[] a = A[i];
			for (int j = 0; j < a.length; j++) {
				if (a[j] == 0) {
					a[j] = 1;
				} else {
					a[j] = 0;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[][] A = new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		new Solution().flipAndInvertImage(A);
		System.out.println();
	}
}
// [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]