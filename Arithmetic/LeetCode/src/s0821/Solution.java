package s0821;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] shortestToChar(String s, char c) {
		int len = s.length();
		char[] cs = s.toCharArray();
		int[] ret = new int[len];
		// 确定所有c的位置
		List<Integer> eIndexList = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			if (cs[i] == c) {
				eIndexList.add(i);
			}
		}
		for (int i = 0; i < len; i++) {
			int min = Integer.MAX_VALUE;
			for (Integer eIndex : eIndexList) {
				min = Math.min(min, Math.abs(eIndex - i));
			}
			ret[i] = min;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		String s = "aaab";
		char c = 'b';
		int[] shortestToChar = new Solution().shortestToChar(s, c);
		for(int i:shortestToChar){
			System.out.print(i + " ");
		}
	}
}