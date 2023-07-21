package daily.s1710;

import java.util.Arrays;

/**
 * 1710. �����ϵ����Ԫ��
 */
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int i = 0;
        while (truckSize > 0 && i < boxTypes.length) {
            if (truckSize < boxTypes[i][0]) {
                // ����������ȡʣ������ truckSize
                max += truckSize * boxTypes[i][1];
            } else {
                max += boxTypes[i][0] * boxTypes[i][1];
            }
            truckSize -= boxTypes[i][0];
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] boxTypes = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        new Solution().maximumUnits(boxTypes, 4);
    }
}