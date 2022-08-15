package s0388;
class Solution {
    public int lengthLongestPath(String input) {
    	int max = 0;
    	
    	String[] split = input.split("\n\t{1}");
    	for(String s : split){
    		System.out.println(s);
    	}
    	
    	return max;
    }
    
    public static void main(String[] args) {
		String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		new Solution().lengthLongestPath(input);
	}
}