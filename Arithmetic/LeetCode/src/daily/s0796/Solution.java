package daily.s0796;

class Solution {
	public boolean rotateString(String s, String goal) {
//		int len = s.length();
//		for (int i = 0; i < len; i++) {
//			s = s.substring(1, len) + s.substring(0, 1);
//			if (s.equals(goal)) {
//				return true;
//			}
//		}
//		return false;
		return s.length() == goal.length() && (s + s).contains(goal);
	}

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "abced";
		System.out.println(new Solution().rotateString(s, goal));
	}
}