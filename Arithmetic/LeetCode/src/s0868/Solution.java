package s0868;

class Solution {
	public int binaryGap(int n) {
		if (Integer.bitCount(n) < 2) {
			return 0;
		}
		// 转换成二进制
		String binaryString = Integer.toBinaryString(n);
		// 双指针分别指向一个1
		
		// 第一个条件一直是为true， 第二个条件无论是否成立，two都要+1
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