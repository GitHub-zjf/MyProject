package lc;

/**
 * 删除排序数组中的重复项
 */
public class Lc1 {

    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left += 1;
                nums[left] = nums[right];
            }
        }
        return ++left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Lc1().removeDuplicates(nums));
    }
}
