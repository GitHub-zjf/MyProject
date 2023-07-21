package daily.s1431;

import java.util.LinkedList;
import java.util.List;

class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> ret = new LinkedList<Boolean>();
		int maxCount = 0;
		for (int candie : candies) {
			maxCount = Math.max(maxCount, candie);
		}
		for (int candie : candies) {
			ret.add(candie + extraCandies >= maxCount);
		}
		return ret;
	}
}