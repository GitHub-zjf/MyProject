package s2347;

import java.util.*;

/**
 * 2347. 最好的扑克手牌
 */
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> suitSet = new HashSet<>();
        for (char suit : suits) {
            suitSet.add(suit);
        }
        if (suitSet.size() == 1) {
            return "Flush";
        }

        Map<Integer, Integer> rankMap = new HashMap<>(ranks.length);
        for (int rank : ranks) {
            rankMap.put(rank, rankMap.getOrDefault(rank, 0) + 1);
        }
        if (rankMap.size() == 5) {
            return "High Card";
        }
        Set<Integer> set = rankMap.keySet();
        for (Integer k : set) {
            Integer count = rankMap.get(k);
            if (count >= 3) {
                return "Three of a Kind";
            }
        }
        return "Pair";
    }
}