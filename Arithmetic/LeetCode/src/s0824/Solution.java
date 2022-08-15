package s0824;

import java.util.StringJoiner;

class Solution {
	public String toGoatLatin(String sentence) {
		StringJoiner sj = new StringJoiner(" ");

		String volit = "AEIOUaeiou";
		String[] split = sentence.split(" ");
		String aStr = "a";
		for (int i = 0; i < split.length; i++) {
			String str = split[i];
			// 单词以元音开头（'a', 'e', 'i', 'o', 'u'）在单词后添加"ma"
			if (volit.indexOf(str.charAt(0)) != -1) {
				str = str + "ma";
			} else {
				// 单词以辅音字母开头， 移除第一个字符并将它放到末尾，之后再添加"ma"
				str = str.substring(1, str.length()) + str.substring(0, 1) + "ma";
			}
			str = str + aStr;
			aStr = aStr + "a";
			sj.add(str);
		}

		return sj.toString();
	}
}