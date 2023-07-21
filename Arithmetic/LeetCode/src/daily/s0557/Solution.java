package daily.s0557;
class Solution {
    public String reverseWords(String s) {
    	char[] chars = s.toCharArray();
    	int left = 0;
    	int spaceIndex = s.indexOf(" ", left);
    	int right = spaceIndex - 1;
    	int countNotSpace = 0;
    	// 第二次找不到空格结束
    	while (countNotSpace < 2) {
    		// 交换位置
    		while (left < right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				
				left++;
				right--;
			}
    		left = spaceIndex + 1;
    		spaceIndex = s.indexOf(" ", left);
    		if(spaceIndex == -1){
    			countNotSpace++;
    			right=chars.length-1;
    			spaceIndex = chars.length;
    		}else {
    			right = spaceIndex - 1;
			}
		}
    	return String.valueOf(chars);
    }
    
    public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(new Solution().reverseWords(s));
    	
	}
}