package daily.s1221;

class Solution {
	public int balancedStringSplit(String s) {
		int left = 0;
		int right = 0;
		int count = 0;
		char[] cs = s.toCharArray();
		for (char c : cs) {
			if('L' == c) left++;
			else right++;
			if(left == right){
				left = right = 0;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().balancedStringSplit("LLLLRRRR"));
	}
}