package s1732;

class Solution {
	public int largestAltitude(int[] gain) {
		int length = gain.length;
		int[] result = new int[length + 1];
		int max = 0;
		result[0] = 0;
		for (int i = 0; i < length; i++) {
			result[i + 1] = result[i] + gain[i];
			max = Math.max(max, result[i + 1]);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] gain = new int[] { -4,-3,-2,-1,4,3,2 };
		System.out.println(new Solution().largestAltitude(gain));
	}

}