package daily.s0400;

class Solution {

//	public int findNthDigit(int n) {
//		System.out.println(n);
//		int n1 = 0;
//		int n2 = 0;
//
//		if (n <= 9) {
//			n1 = 0;
//			n2 = 1;
//		} else if (n > 9 && n <= (9 + 180)) {
//			n1 = 9;
//			n2 = 2;
//		} else if (n > (9 + 180) && n <= (9 + 180 + 2700)) {
//			n1 = 99;
//			n2 = 3;
//		} else if (n > (9 + 180 + 2700) && n <= (9 + 180 + 2700 + 36000)) {
//			n1 = 999;
//			n2 = 4;
//		} else if (n > (9 + 180 + 2700 + 36000) && n <= (9 + 180 + 2700 + 36000 + 450000)) {
//			n1 = 9999;
//			n2 = 5;
//		} else if (n > (9 + 180 + 2700 + 36000 + 450000) && n <= (9 + 180 + 2700 + 36000 + 450000 + 5400000)) {
//			n1 = 99999;
//			n2 = 6;
//		} else if (n > (9 + 180 + 2700 + 36000 + 450000 + 5400000)
//				&& n <= (9 + 180 + 2700 + 36000 + 450000 + 5400000 + 63000000)) {
//			n1 = 999999;
//			n2 = 7;
//		} else if (n > (9 + 180 + 2700 + 36000 + 450000 + 5400000 + 63000000)
//				&& n <= (9 + 180 + 2700 + 36000 + 450000 + 5400000 + 63000000 + 720000000)) {
//			n1 = 9999999;
//			n2 = 8;
//		} else {
//			n1 = 99999999;
//			n2 = 9;
//		}
//		int index = (n - n1) / n2;
//		int index2 = (n - n1) % n2;
//		if (index2 == 0) {
//			int result = n1 + index;
//			return Integer.valueOf(String.valueOf(result).split("")[String.valueOf(result).length() - 1]);
//		} else {
//			int result = n1 + index + 1;
//			return Integer.valueOf(String.valueOf(result).split("")[index2 - 1]);
//		}
//	}

	public static void main(String[] args) {
//		System.out.println(new Solution().findNthDigit(99999989));
	}
}