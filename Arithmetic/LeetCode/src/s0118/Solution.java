package s0118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = new Solution().generate(5);
        for (List<Integer> integers : generate) {
            for (Integer i : integers) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}