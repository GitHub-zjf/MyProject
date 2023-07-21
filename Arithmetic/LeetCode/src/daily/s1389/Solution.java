package daily.s1389;

import java.util.LinkedList;
import java.util.List;

class Solution {
	// ִ����ʱ4ms �ڴ�����37MB
	public int[] createTargetArray(int[] nums, int[] index) {
		int len = nums.length;
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < len; i++) {
			list.add(index[i], nums[i]);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// ִ����ʱ1ms �ڴ�����36.8MB
	public int[] createTargetArray2(int[] nums, int[] index) {
		int len = nums.length;
		int[] target = new int[len];
		for (int i = 0; i < len; i++) {
			target[i] = -1;
		}
		for (int i = 0; i < len; i++) {
			insertNumByIndex(target, nums[i], index[i]);
		}

		return target;
	}

	public void insertNumByIndex(int[] target, int num, int index) {
		if (target[index] != -1) {
			for (int i = target.length - 1; i > index; i--) {
				target[i] = target[i - 1];
			}
		}
		target[index] = num;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1 };
		int[] index = new int[] { 0 };
		int[] createTargetArray = new Solution().createTargetArray2(nums, index);
		for (int c : createTargetArray) {
			System.out.print(c + " ");
		}
	}
}