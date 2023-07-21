package daily.s1604;

import java.util.*;

/**
 * 1604. 警告一小时内使用相同员工卡大于等于三次的人
 */
class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map = new HashMap<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name, new ArrayList<>());
            // 时间转换成分钟数
            int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int minute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            map.get(name).add(hour * 60 + minute);
        }
        List<String> res = new ArrayList<>();
        Set<String> keySets = map.keySet();
        for (String name : keySets) {
            List<Integer> list = map.get(name);
            Collections.sort(list);
            // 某一次与前两次的时间间隔小于60分钟，说明一个小时使用了三次
            for (int i = 2; i < list.size(); i++) {
                int time1 = list.get(i - 2), time2 = list.get(i);
                if (time2 - time1 <= 60) {
                    res.add(name);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}