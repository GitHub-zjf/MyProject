package daily.s0504;

class Solution {
	public String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		String ret = "";
		// �Ƿ�С��0
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
		// ���д��
//		Integer.toString(num, 7);
	}

	public static void main(String[] args) {
		System.out.println(new Solution().convertToBase7(-7));
	}
}