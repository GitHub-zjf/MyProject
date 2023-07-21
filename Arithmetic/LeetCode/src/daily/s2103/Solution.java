package daily.s2103;

class Solution {
	public int countPoints(String rings) {
		int count = 0;
		String[] ringstr = rings.split("");
		String[] rods = new String[]{"","","","","","","","","",""};
		int len = rings.length();

		for (int i = 0; i < len; i += 2) {
			String color = ringstr[i];
			int rod = Integer.valueOf(ringstr[i + 1]);
			if (rods[rod].indexOf(color) == -1) {
				rods[rod] += color;
				if (rods[rod].length() == 3) {
					count++;
				}
			}
		}
		

		return count;
	}

	public static void main(String[] args) {
		System.err.println(new Solution().countPoints("B0B6G0R6R0R6G9"));
	}
}