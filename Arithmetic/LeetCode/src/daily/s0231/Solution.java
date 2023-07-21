package daily.s0231;
/*
 * 将十进制转换为二进制，如果是2的幂，只有首位为1，其余为0
 * 
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n<=0) return false;
        String str = Integer.toBinaryString(n);
        char[] chs = str.toCharArray();
        int result = 0;
        for(char ch:chs){
        	result = result + (ch - '0');
        }
        if(result == 1){
        	return true;
        }
    	return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo(-2147483648));
	}
}