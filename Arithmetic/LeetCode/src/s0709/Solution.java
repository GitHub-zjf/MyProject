package s0709;

class Solution {
	public String toLowerCase(String s) {
		char[] chars = s.toCharArray();
		for (int i=0;i<chars.length;i++) {
			if (65 <= chars[i] && chars[i] <= 90) {
				chars[i] = (char) (chars[i] + 32);
			}
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().toLowerCase("QWERTYUIOPASDFGHJKLZXCVBNM"));
	}
}