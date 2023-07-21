package daily.s0520;

/**
 * 520. ����д��ĸ
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        }
        char first = word.charAt(0);
        char second = word.charAt(1);
        if (Character.isLowerCase(first)) {
            // ����ĸСд��ȫ��Сд
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            // ����ĸ��д��������ȫ����д����ȫ��Сд
            if (Character.isLowerCase(second)) {
                // ȫ��Сд
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                // ȫ����д
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}