package daily.s1253;

import java.util.ArrayList;
import java.util.List;

/**
 *  1253. 重构 2 行二进制矩阵
 */
class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> ret = new ArrayList<>();
        int tempUpper = upper;
        int tempLower = lower;
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 0) {
                row1.add(0);
                row2.add(0);
            } else if (colsum[i] == 2) {
                row1.add(1);
                row2.add(1);
                upper--;
                lower--;
            } else {
                if (upper > lower) {
                    row1.add(1);
                    row2.add(0);
                    upper--;
                } else {
                    row1.add(0);
                    row2.add(1);
                    lower--;
                }
            }
        }

        if (row1.stream().mapToInt(Integer::intValue).sum() != tempUpper ||
                row2.stream().mapToInt(Integer::intValue).sum() != tempLower) {
            return ret;
        }

        if (row1.size() > 0) {
            ret.add(row1);
            ret.add(row2);
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reconstructMatrix(4, 2, new int[]{1, 2, 1, 2, 0}));
    }
}