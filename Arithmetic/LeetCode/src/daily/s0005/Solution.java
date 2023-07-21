package daily.s0005;
class Solution {
    public String longestPalindrome(String s) {
    	int length = s.length();
    	String result = "";
    	while (length>0) {
//    		int begin = 0;
//        	int end = length;
    	}
    	return result;
    }
    
    public boolean valid(String s){
    	return s.equals(new StringBuffer(s).reverse().toString());
    }	
    
    public static void main(String[] args) {
		System.out.println(new Solution().longestPalindrome("abcdefgabcdffggqq"));
	}
}