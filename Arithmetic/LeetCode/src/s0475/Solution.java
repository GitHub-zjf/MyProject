package s0475;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
	public int findRadius(int[] houses, int[] heaters) {
		int len1 = houses.length;
		int len2 = heaters.length;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		for (int i = 0; i < len1; i++) {
			set1.add(houses[i]);
		}
		for (int i = 0; i < len2; i++) {
			set2.add(heaters[i]);
			set3.add(heaters[i]);
		}
		int radius = 0;
		while (true) {
			if (set3.containsAll(set1)) {
				return radius;
			}
			Iterator<Integer> iterator = set2.iterator();
			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				set3.add(integer + 1);
				set3.add(integer - 1);
			}
			set2.addAll(set3);
			radius++;
		}
	}

	public static void main(String[] args) {
		int[] houses = new int[] { 1, 5 };
		int[] heaters = new int[] { 2 };
		System.out.println(new Solution().findRadius(houses, heaters));
	}
}