package daily.s3005;

import java.util.HashMap;

/**
 * 3005. ���Ƶ��Ԫ�ؼ���
 */
class Solution {
    public int maxFrequencyElements(int[] nums) {
        /**
         *  ���� nums��ͬʱ�ù�ϣ��ͳ��ÿ��Ԫ�صĳ��ִ�������ά�����ִ��������ֵ maxCnt��
         *
         * ������ִ��� c>maxCnt����ô���� maxCnt=c���� ans=c��
         * ������ִ��� c=maxCnt����ô������ c��
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