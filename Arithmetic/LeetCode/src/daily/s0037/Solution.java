package daily.s0037;

import java.util.ArrayList;
import java.util.List;

/**
 * 37. ½âÊý¶À
 */
class Solution {
    private boolean[][] line = new boolean[9][9];
    private boolean[][] column = new boolean[9][9];
    private boolean[][][] block = new boolean[3][3][9];
    private boolean valid = false;
    private List<int[]> spaces = new ArrayList<int[]>();

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    spaces.add(new int[]{i, j});
                } else {
                    int digit = board[i][j] - '0' - 1;
                    line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                }
            }
        }

        dfs(board, 0);
    }

    public void dfs(char[][] board, int pos) {
        if (pos == spaces.size()) {
            valid = true;
            return;
        }

        int[] space = spaces.get(pos);
        int i = space[0], j = space[1];
        for (int digit = 0; digit < 9 && !valid; ++digit) {
            if (!line[i][digit] && !column[j][digit] && !block[i / 3][j / 3][digit]) {
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = true;
                board[i][j] = (char) (digit + '0' + 1);
                dfs(board, pos + 1);
                line[i][digit] = column[j][digit] = block[i / 3][j / 3][digit] = false;
            }
        }
    }

    public static void main(String[] args) {
//        char[][] board = new char[9][9];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                String x = scanner.next();
//                board[i][j] = x.toCharArray()[0];
//            }
//        }


//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'}

        char[][] board = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        new Solution().solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]);
                if (j % 3 == 2) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i % 3 == 2) {
                System.out.println("------------------");
            }

        }
    }
}