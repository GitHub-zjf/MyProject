package daily.s1816;

class Solution {
	public String truncateSentence(String s, int k) {
		int n = s.length();
		int end = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i == n || s.charAt(i) == ' ') {
				count++;
				if (count == k) {
					end = i;
					break;
				}
			}
		}
		return s.substring(0, end);
	}

	public static void main(String[] args) {
		String s = "chopper is not a tanuki";
		int k = 5;
		System.out.println(new Solution().truncateSentence(s, k));
	}
}