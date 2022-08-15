package s1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int current = groupSizes[i];
            if (!map.containsKey(current)) {
                map.put(current, new ArrayList<>());
            }

            map.get(current).add(i);
            if (map.get(current).size() == current) {
                ans.add(map.get(current));
                map.remove(current);
            }
        }

        return ans;
    }
}