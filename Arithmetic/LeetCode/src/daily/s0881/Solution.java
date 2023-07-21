package daily.s0881;

import java.util.Arrays;

class Solution {
	public int numRescueBoats(int[] people, int limit) {
		int boatNum = 0;
		if (people.length <= 1) {
			return 1;
		}
		Arrays.sort(people);
		int left = 0;
		int right = people.length - 1;
		while (left < right) {
			int leftLimit = people[left];
			int rightLimit = people[right];
			if (leftLimit + rightLimit <= limit) {
				left++;
				right--;
			} else {
				right--;

			}
			boatNum++;
		}
		if (left == right) {
			boatNum++;
		}

		return boatNum;
	}

	public static void main(String[] args) {
		int[] people = new int[] { 3, 1, 7 };
		int limit = 7;
		System.out.println(new Solution().numRescueBoats(people, limit));
	}
}