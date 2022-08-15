package s0299;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
	public String getHint(String secret, String guess) {
		int A = 0;
		int B = 0;

		char[] secArr = secret.toCharArray();
		char[] gueArr = guess.toCharArray();
		List<Character> secList = new ArrayList<Character>();
		List<Character> gueList = new ArrayList<Character>();
		int len = secArr.length;
		for (int i = 0; i < len; i++) {
			if (secArr[i] == gueArr[i]) {
				A++;
			} else {
				secList.add(secArr[i]);
				gueList.add(gueArr[i]);
			}
		}

		Iterator<Character> iterator = gueList.iterator();
		while (iterator.hasNext()) {
			Character next = iterator.next();
			if (secList.contains(next)) {
				B++;
				secList.remove(next);
			}
		}

		return A + "A" + B + "B";
	}

	public static void main(String[] args) {
		String secret = "1123";
		String guess = "0111";
		System.out.println(new Solution().getHint(secret, guess));
	}
}