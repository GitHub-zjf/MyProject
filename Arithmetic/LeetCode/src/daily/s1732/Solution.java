package daily.s1732;

/**
 * 1732. 找到最高海拔
 */
class Solution {
    /**
     * 2021-02-07
     *
     * @param gain
     * @return
     */
    public int largestAltitude(int[] gain) {
        int length = gain.length;
        int[] result = new int[length + 1];
        int max = 0;
        result[0] = 0;
        for (int i = 0; i < length; i++) {
            result[i + 1] = result[i] + gain[i];
            max = Math.max(max, result[i + 1]);
        }
        return max;
    }

    /**
     * 2022-11-19
     *
     * @param gain
     * @return
     */
    public int largestAltitude2(int[] gain) {
        int max = 0, sum = 0;
        for (int g : gain) {
            sum += g;
            max = Math.max(max, sum);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
        System.out.println(new Solution().largestAltitude(gain));
    }

}