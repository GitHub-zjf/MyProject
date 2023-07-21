package daily.s1450;

import java.util.Arrays;

class Solution {
    /**
     * 枚举
     *
     * @param startTime
     * @param endTime
     * @param queryTime
     * @return
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int len = startTime.length;
        int stuNum = 0;
        for (int i = 0; i < len; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                stuNum++;
            }
        }
        return stuNum;
    }

    /**
     * 差分数组
     *
     * @param startTime
     * @param endTime
     * @param queryTime
     * @return
     */
    public int busyStudent2(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int maxEndTime = Arrays.stream(endTime).max().getAsInt();
        if (queryTime > maxEndTime) {
            return 0;
        }
        int[] cnt = new int[maxEndTime + 2];
        for (int i = 0; i < n; i++) {
            cnt[startTime[i]]++;
            cnt[endTime[i] + 1]--;
        }
        int ans = 0;
        for (int i = 0; i <= queryTime; i++) {
            ans += cnt[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;
        System.out.println(new Solution().busyStudent2(startTime, endTime, queryTime));
    }
}