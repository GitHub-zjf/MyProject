package daily.s0344;

public class Solution {
    public void reverseString(char[] s) {
    	/*Õ»
        Stack<Character> stacks = new Stack<>();
        for(char c:s){
        	stacks.push(c);
        }
        int len = stacks.size();
        for(int i=0;i<len;i++){
        	s[i] = stacks.pop();
        }*/
    	//Ë«Ö¸Õë
    	if (s == null || s.length < 2) {
            return;
        }
        int left = -1;
        int right = s.length;
        while (++left < --right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }
        System.out.println(s);
    }
    
    public static void main(String[] args) {
    	char[] s = {'h','e','l','l','o'};
		new Solution().reverseString(s);
	}
}