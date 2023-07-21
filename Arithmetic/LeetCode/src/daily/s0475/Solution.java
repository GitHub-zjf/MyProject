package daily.s0475;

import java.util.Arrays;

/**
 * 475. 供暖器
 * tip1: 对于每个房屋，要么用前面的暖气，要么用后面的，二者取近的，得到距离
 * tip2: 每间房子找距离自己最近的热水器，计算出【最近距离】，然后取所有【最近距离】的最大值即可
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