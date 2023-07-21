package daily.s1447;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<String> simplifiedFractions(int n) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (is(j, i)) {
					list.add(j + "/" + i);
				}
			}
		}
		return list;
	}

	public boolean is(int a, int b) {
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> simplifiedFractions = new Solution().simplifiedFractions(6);
		simplifiedFractions.forEach(x -> System.out.println(x));
	}
}