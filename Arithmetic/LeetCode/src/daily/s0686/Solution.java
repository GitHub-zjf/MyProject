package daily.s0686;

class Solution {
	public int repeatedStringMatch(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int ans = 0;
		// һ��������B�����ײ��õ�A��һ���֣�β���õ�A��һ���֣�������A'[AA....AA]A' , [ ]
		// �ڱ�Ȼ<=B�ĳ��ȣ����ܳ�<=2*A+B
		int max = 2 * aLen + bLen;
		String sb = "";
		while (sb.length() <= max) {
			sb = sb.concat(a);
			ans++;
			if (sb.indexOf(b) != -1) {
				return ans;
			}
		}
		return -1;
	}
}