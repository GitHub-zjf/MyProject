package daily.s0036;

import java.util.HashSet;
import java.util.Set;

/**
 * 有效的数独
 * 
 * @author zheng
 *
 */
class Solution {
	public boolean isValidSudoku(char[][] board) {
		Set<String> one_set = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					String row = "(" + i + ")" + board[i][j];
					String col = board[i][j] + "(" + j + ")";
					String small_square = "(" + i / 3 + ")" + board[i][j] + "(" + j / 3 + ")";
					if (!one_set.add(row) || !one_set.add(col) || !one_set.add(small_square)){
						return false;
					}
				}
			}
		}
		return true;
	}
}