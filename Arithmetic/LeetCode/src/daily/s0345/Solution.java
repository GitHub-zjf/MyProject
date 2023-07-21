package daily.s0345;


class Solution {
    public String reverseVowels(String s) {
    	String str = "aAeEiIoOuU";
    	char[] chars = s.toCharArray();
    	
    	int left = 0;
    	int right = chars.length - 1;
    	
    	while (left < right) {
    		int retL = str.indexOf(chars[left]);
    		int retR = str.indexOf(chars[right]);
    		if(retL == -1){
    			left++;
    		}
    		if(retR == -1){
    			right--;
    		}
    		if(retL != -1 && retR != -1){
    			// ½»»»Î»ÖÃ
    			char temp = chars[left];
    			chars[left] = chars[right];
    			chars[right] = temp;
    			left++;
    			right--;
    		}
    	}
        return String.valueOf(chars);
    }
    
    public static void main(String[] args) {
    	String str = "abu";
    	System.out.println(new Solution().reverseVowels(str));
	}
}