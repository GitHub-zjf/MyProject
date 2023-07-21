package daily.s0067;

public class Solution {
	public static String addBinary(String a, String b) {
		int tag = 0; // 记录进位数据

		int lena = a.length();
		int lenb = b.length();
		int len = lena > lenb ? a.length() : b.length();
		int[] result = new int[len];

		char[] acs = a.toCharArray();
		char[] bcs = b.toCharArray();
		
		for (int i = lena - 1, j = lenb - 1; i >= 0 && j >= 0; i--, j--) {
			int temp = (acs[i] - '0') + (bcs[j] - '0') + tag;
			if (lena > lenb) {
				result[i] = temp % 2;
			} else {
				result[j] = temp % 2;
			}
			tag = temp / 2;
		}
		if (lena > lenb) {
			for (int i = lena - lenb - 1; i >= 0; i--) {
				int temp = (acs[i] - '0') + tag;
				result[i] = temp % 2;
				tag = temp / 2;
			}
		}
		if (lena < lenb) {
			for (int j = lenb - lena - 1; j >= 0; j--) {
				int temp = (bcs[j] - '0') + tag;
				result[j] = temp % 2;
				tag = temp / 2;
			}
		}
		
		String trueResult = "";
		for (int i : result) {
			trueResult += i;
		}
		if (tag != 0) {
			trueResult = "1" + trueResult;
		}
		return trueResult;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(Solution.addBinary("100", "100"));
		long stopTime = System.currentTimeMillis();
		System.out.println((stopTime - startTime) + "ms");
	}
}