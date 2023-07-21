package daily.s0434;
class Solution {
    public int countSegments(String s) {
    	s = s.trim();
    	if(s.length() <= 0){
    		return 0;
    	}
        return s.split(" {1,}").length;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().countSegments("   f f "));
	}
}