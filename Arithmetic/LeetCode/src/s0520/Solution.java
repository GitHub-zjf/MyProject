package s0520;

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
        if ('a' <= first && first <= 'z') {
            // ����ĸСд��ȫ��Сд
            for (int i = 1; i < word.length(); i++) {
                char temp = word.charAt(i);
                if ('A' <= temp && temp <= 'Z') {
                    return false;
                }
            }
        } else {
            // ����ĸ��д��������ȫ����д����ȫ��Сд
            if ('a' <= second && second <= 'z') {
                // ȫ��Сд
                for (int i = 2; i < word.length(); i++) {
                    char temp = word.charAt(i);
                    if ('A' <= temp && temp <= 'Z') {
                        return false;
                    }
                }
            } else {
                // ȫ����д
                for (int i = 2; i < word.length(); i++) {
                    char temp = word.charAt(i);
                    if ('a' <= temp && temp <= 'z') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}