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
			// ������Ԫ����ͷ��'a', 'e', 'i', 'o', 'u'���ڵ��ʺ����"ma"
			if (volit.indexOf(str.charAt(0)) != -1) {
				str = str + "ma";
			} else {
				// �����Ը�����ĸ��ͷ�� �Ƴ���һ���ַ��������ŵ�ĩβ��֮�������"ma"
				str = str.substring(1, str.length()) + str.substring(0, 1) + "ma";
			}
			str = str + aStr;
			aStr = aStr + "a";
			sj.add(str);
		}

		return sj.toString();
	}
}