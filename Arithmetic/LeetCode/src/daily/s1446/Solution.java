package daily.s1446;

class Solution {
	public int maxPower(String s) {
		int max = 1;
		int len = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				len++;
				max = Math.max(max, len);
			}else{
				len = 1;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().maxPower("ee"));
	}
}