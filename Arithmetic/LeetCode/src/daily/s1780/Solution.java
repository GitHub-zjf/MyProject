package daily.s1780;

/**
 * 1780. �ж�һ�������Ƿ���Ա�ʾ�������ݵĺ�
 */
class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

}