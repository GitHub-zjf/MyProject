package daily.s0682;

import java.util.ArrayList;
import java.util.List;

/**
 * 682. °ôÇò±ÈÈü
 */
class Solution {
    public int calPoints(String[] operations) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < operations.length; i++) {
            if ("C".equals(operations[i])) {
                list.remove(list.size() - 1);
            } else if ("D".equals(operations[i])) {
                int temp = Integer.parseInt(list.get(list.size() - 1)) * 2;
                list.add(String.valueOf(temp));
            } else if ("+".equals(operations[i])) {
                int temp = Integer.parseInt(list.get(list.size() - 1)) + Integer.parseInt(list.get(list.size() - 2));
                list.add(String.valueOf(temp));
            } else {
                list.add(operations[i]);
            }
        }
        return list.stream().mapToInt(Integer::parseInt).sum();
    }
}
