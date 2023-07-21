package daily.s1604;

import java.util.*;

/**
 * 1604. ����һСʱ��ʹ����ͬԱ�������ڵ������ε���
 */
class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map = new HashMap<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name, new ArrayList<>());
            // ʱ��ת���ɷ�����
            int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int minute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            map.get(name).add(hour * 60 + minute);
        }
        List<String> res = new ArrayList<>();
        Set<String> keySets = map.keySet();
        for (String name : keySets) {
            List<Integer> list = map.get(name);
            Collections.sort(list);
            // ĳһ����ǰ���ε�ʱ����С��60���ӣ�˵��һ��Сʱʹ��������
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