package daily.s1844;

/**
 * 1844. �������������ַ��滻
 */
class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = (char) (arr[i] - '0' + arr[i - 1]);
        }
        return new String(arr);
    }
}