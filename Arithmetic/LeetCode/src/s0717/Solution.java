package s0717;

class Solution {
	// ����1������������0��һ��
	public boolean isOneBitCharacter(int[] bits) {
		int position = 0;
		while (position < bits.length - 1) {
			position += bits[position] == 1 ? 2 : 1;
		}
		return position == bits.length - 1;
	}
}