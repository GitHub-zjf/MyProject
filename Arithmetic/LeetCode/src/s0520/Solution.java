package s0520;

/**
 * 520. 检测大写字母
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        }
        char first = word.charAt(0);
        char second = word.charAt(1);
        if ('a' <= first && first <= 'z') {
            // 首字母小写，全部小写
            for (int i = 1; i < word.length(); i++) {
                char temp = word.charAt(i);
                if ('A' <= temp && temp <= 'Z') {
                    return false;
                }
            }
        } else {
            // 首字母大写，接下来全部大写或者全部小写
            if ('a' <= second && second <= 'z') {
                // 全部小写
                for (int i = 2; i < word.length(); i++) {
                    char temp = word.charAt(i);
                    if ('A' <= temp && temp <= 'Z') {
                        return false;
                    }
                }
            } else {
                // 全部大写
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