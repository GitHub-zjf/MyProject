package daily.s2037;

import java.util.Arrays;

class Solution {
	public int minMovesToSeat(int[] seats, int[] students) {
		int count = 0;

		Arrays.sort(seats);
		Arrays.sort(students);
		int length = seats.length;
		for (int i = 0; i < length; i++) {
			count = count + (Math.abs(seats[i] - students[i]));
		}

		return count;
	}
}