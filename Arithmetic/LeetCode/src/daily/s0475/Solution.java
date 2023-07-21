package daily.s0475;

import java.util.Arrays;

/**
 * 475. ��ů��
 * tip1: ����ÿ�����ݣ�Ҫô��ǰ���ů����Ҫô�ú���ģ�����ȡ���ģ��õ�����
 * tip2: ÿ�䷿���Ҿ����Լ��������ˮ�����������������롿��Ȼ��ȡ���С�������롿�����ֵ����
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int max = 0;
        for (int house : houses) {
            int min = Integer.MAX_VALUE;
            for (int heater : heaters) {
                min = Math.min(min, Math.abs(house - heater));
            }
            max = Math.max(max, min);
        }
        return max;
    }
}