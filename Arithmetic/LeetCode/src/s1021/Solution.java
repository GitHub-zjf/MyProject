package s1021;
class Solution {
    public String removeOuterParentheses(String S) {
    	String result = "";
    	char[] chars = S.toCharArray();
    	int tempLeft = 0;
    	int tempRight = 0;
    	int leftCount = 0;
    	int rightCount = 0;
    	for(int i=0;i<chars.length;i++){
    		if('(' == chars[i]){
    			leftCount++;
    		}else{
    			rightCount++;
    		}
    		if(leftCount == rightCount){
    			leftCount = 0;
    			rightCount = 0;
    			tempLeft = tempRight;
    			tempRight = i+1;
    			result += S.subSequence(tempLeft+1, tempRight-1);
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().removeOuterParentheses("(()())(())(()(()))"));
	}
}