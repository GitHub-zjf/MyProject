package daily.s0905;

class Solution {
	public int[] sortArrayByParity(int[] nums) {
		// ����߿�ʼ������
		int left = 0;
		// ���ұ߿�ʼ��ż��
		int right = nums.length - 1;
		while (left < right) {
			int num1 = nums[left];
			int num2 = nums[right];

			boolean isOdd = (num1 % 2 == 1);
			boolean isEven = (num2 % 2 == 0);
			if (isOdd && isEven) { // num1������ && num2 ��ż�� -- ����λ�� left+1 right-1
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
				right--;
			} else if (!isOdd && isEven) { // num1��ż�� && num2 ��ż�� -- left+1
				left++;
			} else if (!isOdd && !isEven) { // num1��ż�� && num2 ������ -- left+1 rigth-1
				left++;
				right--;
			} else if (isOdd && !isEven) { // num1������ && num2 ������ -- right-1;
				right--;
			}

		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 1, 2, 4, 5, 6, 4, 7, 8, 9, 10 };
		int[] sortArrayByParity = new Solution().sortArrayByParity(nums);
		for (int i : sortArrayByParity) {
			System.out.print(i + " ");
		}
	}
}