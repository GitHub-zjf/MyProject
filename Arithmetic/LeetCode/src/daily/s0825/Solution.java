package daily.s0825;

import java.util.Arrays;

class Solution {
	public int numFriendRequests(int[] ages) {
		int n = ages.length;
		Arrays.sort(ages);
		int left = 0, right = 0, ans = 0;
		for (int age : ages) {
			if (age < 15) {
				continue;
			}
			while (ages[left] <= 0.5 * age + 7) {
				++left;
			}
			while (right + 1 < n && ages[right + 1] <= age) {
				++right;
			}
			ans += right - left;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] ages = new int[] { 20, 30, 100, 110, 120 };
		System.out.println(new Solution().numFriendRequests(ages));
	}
}