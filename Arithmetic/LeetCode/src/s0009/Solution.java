package s0009;
/*
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

class Solution {
    public boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        String str2 = new StringBuffer(str1).reverse().toString();
    	return str1.equals(str2);
    }
}