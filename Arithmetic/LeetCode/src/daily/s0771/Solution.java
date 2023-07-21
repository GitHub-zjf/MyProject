package daily.s0771;

/**
 * 771. 宝石与石头
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int len = stones.length();
        for (int i = 0; i < jewels.length(); i++) {
            stones = stones.replace(String.valueOf(jewels.charAt(i)), "");
        }
        return len - stones.length();
    }
}