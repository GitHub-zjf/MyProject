package daily.s0476;

/**
 * 476. Êý×ÖµÄ²¹Êý
 */
class Solution {

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        double pow = Math.pow(2, s.length());
        return num ^ ((int) (pow - 1));
    }

}