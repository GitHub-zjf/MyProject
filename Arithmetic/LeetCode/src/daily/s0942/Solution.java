package daily.s0942;

class Solution {
	public int[] diStringMatch(String s) {
		int len = s.length();
		int min = 0;
		int max = len;
		int[] ret = new int[len + 1];
		for (int i = 0; i < len; i++) {
			ret[i] = s.charAt(i) == 'I' ? min++ : max--;
		}
		ret[len] = min;
		return ret;
	}
	
	public static void main(String[] args) {
		int[] diStringMatch = new Solution().diStringMatch("DDI");
		for(int s:diStringMatch){
			System.out.print(s + ",");
		}
	}
}