package daily.s2000;

class Solution {
	public String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		StringBuffer str = new StringBuffer(word.substring(0, index + 1));
		return str.reverse().toString() + word.substring(index + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().reversePrefix("abcd", 'z'));
	}
}