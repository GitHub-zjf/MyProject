package daily.s0162;

/**
 * @author zhengjianfeng
 * 162. Ѱ�ҷ�ֵ
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}