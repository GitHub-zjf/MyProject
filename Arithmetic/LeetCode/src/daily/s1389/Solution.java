package daily.s1389;

import java.util.LinkedList;
import java.util.List;

class Solution {
	// 执行用时4ms 内存消耗37MB
	public int[] createTargetArray(int[] nums, int[] index) {
		int len = nums.length;
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < len; i++) {
			list.add(index[i], nums[i]);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 执行用时1ms 内存消耗36.8MB
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