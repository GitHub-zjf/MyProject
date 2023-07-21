package daily.s1078;

import java.util.LinkedList;
import java.util.List;

class Solution {
	public String[] findOcurrences(String text, String first, String second) {
		List<String> retList = new LinkedList<String>();
		int left = 0;
		int right = left + 1;
		String[] texts = text.split(" ");
		int len = texts.length;
		while (left < len - 2) {
			String tempFirst = texts[left];
			String tempSecond = texts[right];
			if (first.equals(tempFirst) && second.equals(tempSecond)) {
				retList.add(texts[right + 1]);
			}
			left++;
			right++;
		}

		return retList.toArray(new String[0]);
	}
}