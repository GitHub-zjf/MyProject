package s0009;
/*
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 */

class Solution {
    public boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        String str2 = new StringBuffer(str1).reverse().toString();
    	return str1.equals(str2);
    }
}