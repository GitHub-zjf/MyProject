package s0258;

class Solution {
	public int addDigits(int num) {
		// ģ��ÿһ�����
//		String numStr = String.valueOf(num);
//		while (numStr.length() > 1) {
//			String[] numArr = numStr.split("");
//			int len = numArr.length;
//			int count = 0;
//			for (int i = 0; i < len; i++) {
//				count += Integer.parseInt(numArr[i]);
//			}
//			numStr = String.valueOf(count);
//		}
//		return Integer.parseInt(numStr);
		// ģ��ÿһ�����
		while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;

		
		// ����ģ��ÿһ����ӣ�������ȷ��������
//		while(num>=10){
//            num=num/10+num%10;
//        }
//        return num;
	}

	public static void main(String[] args) {
		System.err.println(new Solution().addDigits(Integer.MAX_VALUE));
	}
}