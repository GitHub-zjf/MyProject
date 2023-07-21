package daily.s1002;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
	public List<String> commonChars(String[] A) {
		List<String> list = new ArrayList<String>();
		String[] firstArray = A[0].split("");
		for (String str : firstArray) {
			list.add(str);
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			for (int i = 1; i < A.length; i++) {
				int index = A[i].indexOf(str);
				if (index == -1) {
					iterator.remove();
					break;
				} else {
					A[i] = A[i].substring(0, index) + A[i].substring(index + 1, A[i].length());
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {
		String[] A = new String[] { "cool","lock","cook" };
		List<String> commonChars = new Solution().commonChars(A);
		commonChars.forEach(x -> {
			System.out.println(x);
		});
	}
}