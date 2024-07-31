package daily.s2961;

import java.util.ArrayList;
import java.util.List;

/**
 * 2961. Ë«Ä£ÃİÔËËã
 */
class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<Integer>();
        int length = variables.length;
        for (int i = 0; i < length; i++) {
            int[] v = variables[i];
            if (powMod(powMod(v[0], v[1], 10), v[2], v[3]) == target) {
                result.add(i);
            }
        }

        return result;
    }

    public int powMod(int x, int y, int mod) {
        int res = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }
}