package daily.s1365;

import java.util.Arrays;

class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int length = nums.length;
		int[] numsClone = nums.clone();
		Arrays.sort(numsClone);
		int[] result = new int[length];
		
		return null;
	}
	
	public int[] smallerNumbersThanCurrent2(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (i == j) {
					continue;
				} else if (nums[i] > nums[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 8, 1, 2, 2, 3 };
		int[] smallerNumbersThanCurrent = new Solution().smallerNumbersThanCurrent(nums);
		for (int i : smallerNumbersThanCurrent) {
			System.out.print(i + " ");
		}
		//[4,0,1,1,3]
	}
}