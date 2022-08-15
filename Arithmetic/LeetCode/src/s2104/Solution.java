package s2104;

class Solution {
	public long subArrayRanges(int[] nums) {
		int n = nums.length;
        long ret = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                ret += max - min;
            }
        }
        return ret;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 4, -2, -3, 4, 1 };
		System.out.println(new Solution().subArrayRanges(nums));
	}
}