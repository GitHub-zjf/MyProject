package sw0053I;

class Solution {
	public int search(int[] nums, int target) {
		int count = 0;

		for (int num : nums) {
			if (num == target){
				count++;
			}
			if (count > 0 && num > target){
				break;
			}
		}

		return count;
	}
}