package s1306;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

class Solution {
	public int daysBetweenDates(String date1, String date2) {
		long day1 = LocalDate.parse(date1).getLong(ChronoField.EPOCH_DAY);
    	long day2 = LocalDate.parse(date2).getLong(ChronoField.EPOCH_DAY);
    	return (int) Math.abs(day1 - day2);
	}

	public static void main(String[] args) {
		String date1 = "2020-01-15";
		String date2 = "2019-12-31";
		System.out.println(new Solution().daysBetweenDates(date1, date2));
	}
}