package daily.s2437;

/**
 *  2437. 有效时间的数目
 */
class Solution {
    public int countTime(String time) {
        int result = 1;
        int firstChar = time.charAt(0);
        int secondChar = time.charAt(1);
        int thirdChar = time.charAt(3);
        int fourthChar = time.charAt(4);
        char x = '?';
        if (thirdChar == x) {
            result *= 6;
        }
        if (fourthChar == x) {
            result *= 10;
        }
        if (firstChar == x && secondChar == x) {
            result *= 24;
        } else if (firstChar == x && secondChar != x) {
            if (secondChar < '4') {
                result *= 3;
            } else {
                result *= 2;
            }
        } else if (firstChar != x && secondChar == x) {
            if (firstChar < '2') {
                result *= 10;
            } else {
                result *= 4;
            }
        }
        return result;
    }
}