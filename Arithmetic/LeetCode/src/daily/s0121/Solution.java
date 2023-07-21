package daily.s0121;

class Solution {
	// public int maxProfit(int[] prices) {
	// int max = 0;
	// for (int i = 0; i < prices.length; i++) {
	// for (int j = i + 1; j < prices.length; j++) {
	// max = Math.max(max, prices[j] - prices[i]);
	// }
	// }
	// return max;
	// }
	// public int maxProfit(int[] prices) {
	// int max = 0;
	// int left = 0;
	// int right = 1;
	// while (left < prices.length - 1) {
	// max = Math.max(max, prices[right] - prices[left]);
	// if (right == prices.length - 1) {
	// left++;
	// right = left + 1;
	// } else {
	// right++;
	// }
	// }
	// return max;
	// }
	public static void main(String[] args) {
		int[] prices = new int[] { 1, 2 };
		System.out.println(new Solution().maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		if (prices.length <= 1){
			return 0; // ����û�����һ���Ĭ�����棬�����ж�һ��
		}
		int max = 0; // �����������ֵ
		int min = prices[0]; // ����������Сֵ
		for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]); // ���θ���min��max
			max = Math.max(max, prices[i] - min);
		}
		return max;
	}
}