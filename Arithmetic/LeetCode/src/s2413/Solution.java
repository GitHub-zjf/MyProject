package s2413;

/**
 *  2413. ��Сż����
 */
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}