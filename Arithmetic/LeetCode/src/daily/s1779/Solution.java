package daily.s1779;

/**
 * 1779. �ҵ����������ͬ X �� Y ����ĵ�
 */
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        int len = points.length;
        for (int i = 0; i < len; i++) {
            int[] point = points[i];
            if (x == point[0] || y == point[1]) {
                int distance = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                if (distance < min) {
                    index = i;
                    min = distance;
                }
            }
        }
        return index;
    }
}