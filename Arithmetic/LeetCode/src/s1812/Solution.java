package s1812;

import java.util.Arrays;
import java.util.List;

/**
 * 1812. 判断国际象棋棋盘中一个格子的颜色
 *
 * @author zheng
 */
class Solution {
    /**
     * 2021-05-10
     *
     * @param coordinates
     * @return
     */
    public boolean squareIsWhite(String coordinates) {
        String x = coordinates.split("")[0];
        int y = Integer.parseInt(coordinates.split("")[1]);
        List<String> list = Arrays.asList("a", "c", "e", "g");
        if (y % 2 == 0) {
            if (list.contains(x)) {
                return true;
            }
            return false;
        } else {
            if (list.contains(x)) {
                return false;
            }
            return true;
        }
    }

    /**
     * 2022-12-08
     *
     * @param coordinates
	 * 从左下角开始，棋盘的行数和列数（均从 1 开始计数）之和如果为奇数，则为白色格子，如果和为偶数，则为黑色格子。
     * @return
     */
    public boolean squareIsWhite2(String coordinates) {
		return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().squareIsWhite("h3"));
    }
}