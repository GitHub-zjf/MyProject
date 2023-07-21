package daily.s1785;

/**
 * 1785. 构成特定和需要添加的最少元素
 */
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long diff = Math.abs(sum - goal);
        // 向上取整
        return (int) Math.ceil((double) diff / limit);
    }
}