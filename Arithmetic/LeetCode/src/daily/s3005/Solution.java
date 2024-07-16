package daily.s3005;

import java.util.HashMap;

/**
 * 3005. 最大频率元素计数
 */
class Solution {
    public int maxFrequencyElements(int[] nums) {
        /**
         *  遍历 nums，同时用哈希表统计每个元素的出现次数，并维护出现次数的最大值 maxCnt：
         *
         * 如果出现次数 c>maxCnt，那么更新 maxCnt=c，答案 ans=c。
         * 如果出现次数 c=maxCnt，那么答案增加 c。
         *
         */

        int ans = 0;
        int maxCnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int c = map.merge(num, 1, Integer::sum);
            if (c > maxCnt) {
                maxCnt = c;
                ans = c;
            } else if (c == maxCnt) {
                ans += c;
            }
        }
        return ans;
    }
}