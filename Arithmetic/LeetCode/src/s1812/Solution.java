package s1812;

import java.util.Arrays;
import java.util.List;

/**
 * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标。下图是国际象棋棋盘示意图。
 * 
 * @author zheng
 *
 */
class Solution {
	public boolean squareIsWhite(String coordinates) {
		String x = coordinates.split("")[0];
		int y = Integer.parseInt(coordinates.split("")[1]);
		List<String> list = Arrays.asList("a", "c", "e", "g");
		if (y % 2 == 0) {
			if (list.contains(x))
				return true;
			return false;
		} else {
			if (list.contains(x))
				return false;
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Solution().squareIsWhite("h3"));
	}
}