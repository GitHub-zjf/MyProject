package s0119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * 解法1
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rowList.add(1);
                } else {
                    rowList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(rowList);
        }
        return list.get(rowIndex);
    }

    /**
     * 解法2 ： 只使用一个列表记住前一行的数据 -- 优化空间复杂度
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> preList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    preList.add(1);
                } else {
                    preList.add(ans.get(j) + ans.get(j - 1));
                }
            }
            ans = preList;
        }

        return ans;
    }

}