package s0125;

class Solution {
	public boolean isPalindrome(String s) {
		// String str = new StringBuilder(s).reverse().toString();
		// str = str.toLowerCase().replaceAll("[^0-9a-zA-Z]","");
		// s = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
		// return str.equals(s);
		s = s.toLowerCase();

		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			while (i < j && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'))
				i++;
			while (i < j && !(s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9'))
				j--;
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
	}
}