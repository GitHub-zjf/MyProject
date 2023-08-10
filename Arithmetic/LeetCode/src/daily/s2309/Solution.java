package daily.s2309;

/**
 * 2309. ��ߴ�Сд�����Ӣ����ĸ
 */
class Solution {
    public String greatestLetter(String s) {
        String result = "";
        // ���Сд�ַ�
        char[] lower = new char[26];
        // ��Ŵ�д�ַ�
        char[] upper = new char[26];

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                lower[aChar - 97] = aChar;
            }
            if (Character.isUpperCase(aChar)) {
                upper[aChar - 65] = aChar;
            }
        }

        for (int i = lower.length - 1; i >= 0; i--) {
            if (!"\u0000".equals(String.valueOf(lower[i])) && !"\u0000".equals(String.valueOf(upper[i]))) {
                result = String.valueOf(upper[i]);
                break;
            }
        }

        return result;
    }

    public String greatestLetter2(String s) {
        // ��z��a����s������
        char z = 122;
        char a = 97;
        for (char lower = z; lower >= a; lower--) {
            char upper = (char) (lower - 32);
            if (s.indexOf(upper) != -1 && s.indexOf(lower) != -1) {
                return String.valueOf(upper);
            }
        }
        return "";
    }

}