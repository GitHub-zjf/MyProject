package daily.s0504;

class Solution {
	public String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		String ret = "";
		// 是否小于0
		boolean isLess = false;
		if (num < 0) {
			num = num * -1;
			isLess = true;
		}

		while (num > 0) {
			ret = (num % 7) + ret;
			num /= 7;
		}
		if (isLess) {
			ret = "-" + ret;
		}
		return ret;
		// 简洁写法
//		Integer.toString(num, 7);
	}

	public static void main(String[] args) {
		System.out.println(new Solution().convertToBase7(-7));
	}
}