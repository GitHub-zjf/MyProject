package s1652;

/**
 *  1652. ²ğÕ¨µ¯
 */
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
		int[] ret = new int[n];
		if (k == 0) {
			return ret;
		}
		boolean x = false;
		if(k<0){
			x = true;
			k = -k;
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			
			for (int j = 1; j <= k; j++) {
				int index = 0;
				if(x){
					index = (i - j + n) % n;
				}else {
					index = (i + j + n) % n;
				}
				
				sum = sum + code[index];
			}
			ret[i] = sum;
		}
		return ret;
    }
}