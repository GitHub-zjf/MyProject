package s1742;

/**
 * 1742. 盒子中小球的最大数量
 */
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        // 最大到45
        int[] boxes = new int[45];
        int max = -1;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0, x = i;
            while (x != 0) {
                sum += x % 10;
                x = x / 10;
            }
            boxes[sum - 1]++;
            max = Math.max(boxes[sum - 1], max);
        }
        return max;
    }
}