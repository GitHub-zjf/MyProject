package s0058;

public class Solution {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
    	return s.subSequence(s.lastIndexOf(" ")+1, s.length()).length();
    }
    
    public static void main(String[] args) {
		String s = "a ";
		System.out.println(new Solution().lengthOfLastWord(s));
	}
}