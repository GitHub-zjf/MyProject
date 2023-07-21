package daily.s0728;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (isSdnums(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public boolean isSdnums(int num) {
		String[] divNums = String.valueOf(num).split("");
		for (String divNum : divNums) {
			int div = Integer.valueOf(divNum);
			if (div == 0 || num % div != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int left = 1, right = 1000;
		new Solution().selfDividingNumbers(left, right).forEach(i -> {
			System.out.print(i + " ");
		});
	}
}