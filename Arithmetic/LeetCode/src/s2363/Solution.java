package s2363;

import java.util.*;

/**
 * 2363. 合并相似的物品
 */
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], map.getOrDefault(items1[i][0], 0) + items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            List<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            ans.add(list);
        }
        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));
        return ans;
    }
}