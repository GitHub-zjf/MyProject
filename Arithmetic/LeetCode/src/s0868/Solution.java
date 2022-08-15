package s0868;

class Solution {
	public int binaryGap(int n) {
		if (Integer.bitCount(n) < 2) {
			return 0;
		}
		// ת���ɶ�����
		String binaryString = Integer.toBinaryString(n);
		// ˫ָ��ֱ�ָ��һ��1
		
		// ��һ������һֱ��Ϊtrue�� �ڶ������������Ƿ������two��Ҫ+1
//		int one = 0;
//		int two = one + 1;
//		int max = 0;
//		int len = binaryString.length();
		
//		while (two < len) {
//			char charAt = binaryString.charAt(one);
//			char charAt2 = binaryString.charAt(two);
//
//			if (charAt == '1' && charAt2 == '1') {
//				max = Math.max(max, two - one);
//				one = two;
//				two++;
//			}
//			if (charAt == '1' && charAt2 == '0') {
//				two++;
//			}
//		}

		int left = 0;
		int max = 0;
		int len = binaryString.length();
		for (int i = 0; i < len; i++) {
			if (binaryString.charAt(i) == '1') {
				max = Math.max(max, i - left);
				left = i;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().binaryGap(1000001));
	}
}