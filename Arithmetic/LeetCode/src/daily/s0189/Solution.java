package daily.s0189;

public class Solution {
	public static void rotate(int[] nums, int k) {
/*		for (int i = nums.length - 1; k > 0; k--) {
			int temp = nums[i];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
*/
		int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		Solution.rotate(nums, 2);
		for (int i : nums) {
			System.out.print(i);
		}
	}
}