package daily.s1154;

class Solution {
	public int dayOfYear(String date) {
		String[] dateStrs = date.split("-");
		int year = Integer.parseInt(dateStrs[0]);
		int month = Integer.parseInt(dateStrs[1]);
		int day = Integer.parseInt(dateStrs[2]);

		int[] months = new int[] { 1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };

		boolean isLeapYear = ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
		int x = isLeapYear ? 1 : 0;
		return months[month - 1] + x + day - 1;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(new Solution().dayOfYear("2003-03-01"));
	}
}