package daily.s0007;

class Solution {
	public int reverse(int x) {
		int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
	}
}














//String str = String.valueOf(x);
//boolean isMinus = false;
//if (str.indexOf("-") != -1) {
//	str = str.substring(1, str.length());
//	isMinus = true;
//}
//StringBuilder sBuilder = new StringBuilder(str).reverse();
//if (isMinus) {
//	sBuilder.insert(0, "-");
//}
//String result = sBuilder.toString();
//int r=0;
//try{
//	r = Integer.parseInt(result);
//}catch(Exception e){
//	return 0;
//}
//return r;