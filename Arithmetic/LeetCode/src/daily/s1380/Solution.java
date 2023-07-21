package daily.s1380;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<Integer> luckyNumbers(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[] min = new int[m];
		int[] max = new int[n];
		
		Arrays.fill(min, Integer.MAX_VALUE);
		Arrays.fill(max, Integer.MIN_VALUE);

		// 每一行的最小值 每一列的最大值
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				min[i] = Math.min(min[i], matrix[i][j]);
				max[j] = Math.max(max[i], matrix[i][j]);
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				if(temp == min[i] && temp == max[j]){
					list.add(temp);
				}
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
		new Solution().luckyNumbers(matrix);
	}
}