package s2006;

class Solution {
	public int countKDifference(int[] nums, int k) {
		int count = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(Math.abs(nums[i] - nums[j]) == k){
					count++;
				}
			}
		}
		return count;
	}
}