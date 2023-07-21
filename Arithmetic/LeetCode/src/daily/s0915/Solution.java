package daily.s0915;

/**
 * 915. 分割数组
 */
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] minRight = new int[n];
        // 从右往左记录每一个右区间的最小值
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        // 左区间的最大值
        int maxLeft = 0;
        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            if (maxLeft <= minRight[i + 1]) {
                return i + 1;
            }
        }
        return n - 1;
    }

    public int partitionDisjoint2(int[] nums) {
        int leftMax = nums[0], leftPos = 0, len = nums.length, curMax = nums[0];
        for (int i = 1; i < len - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }


    public static void main(String[] args) {
        new Solution().partitionDisjoint(new int[]{5, 0, 3, 8, 6});
    }
}