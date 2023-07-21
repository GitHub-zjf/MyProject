package daily.s1295;

class Solution {
	public int findNumbers1(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || (num >= 100000 && num <= 999999)) {
				count++;
			}
		}
		return count;
	}

	public int findNumbers2(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (((int) Math.log10(num) + 1) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 555, 901, 482, 1771 };
		System.out.println(new Solution().findNumbers2(nums));
	}
}