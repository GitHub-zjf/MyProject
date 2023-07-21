package daily.s0680;

class Solution {
	// 记录不相等的的次数，最多记录一次
	int errorNum = 0;
	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}else {
				if(errorNum == 0){
					errorNum++;
					return validPalindrome(s.substring(left,right)) || validPalindrome(s.substring(left + 1, right + 1));
				}
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.err.println(new Solution().validPalindrome("abca"));
	}
}