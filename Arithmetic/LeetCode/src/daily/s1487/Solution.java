package daily.s1487;

import java.util.HashMap;
import java.util.Map;

/**
 * 1487. 保证文件名唯一
 */
class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!map.containsKey(name)) {
                res[i] = name;
                map.put(name, 1);
            } else {
                int k = map.get(name);
                while (map.containsKey(addSuffix(name, k))) {
                    k++;
                }
                res[i] = addSuffix(name, k);
                map.put(name, k);
                map.put(res[i], 1);
            }
        }
        return res;
    }

    public String addSuffix(String name, int k) {
        return name + "(" + k + ")";
    }

}