package s1704;

import java.util.Arrays;
import java.util.List;

/**
 * ÅĞ¶Ï×Ö·û´®µÄÁ½°ëÊÇ·ñÏàËÆ
 * 
 * @author zheng
 *
 */
class Solution {
	public boolean halvesAreAlike(String s) {
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		int length = s.length();
		char[] str1 = s.substring(0, length / 2).toLowerCase().toCharArray();
		char[] str2 = s.substring(length / 2, length).toLowerCase().toCharArray();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < length / 2; i++) {
			if(vowels.contains(str1[i])){
				count1++;
			}
			if(vowels.contains(str2[i])){
				count2++;
			}
		}
		return count1 == count2;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().halvesAreAlike("AbCdEfGh"));
	}
}