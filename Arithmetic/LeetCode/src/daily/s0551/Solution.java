package daily.s0551;

class Solution {
	/*
	 * 'A'£ºAbsent£¬È±ÇÚ 'L'£ºLate£¬³Ùµ½ 'P'£ºPresent£¬µ½³¡
	 */
	public boolean checkRecord(String s) {
		int aCount = 0;
		int lCount = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == 'A') {
				aCount++;
				lCount = 0;
			} else if (s.charAt(i) == 'L') {
				lCount++;
			} else {
				lCount = 0;
			}
			if (aCount >= 2 || lCount >= 3) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().checkRecord("PPALLL"));
	}
}