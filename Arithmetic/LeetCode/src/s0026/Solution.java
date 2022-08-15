package s0026;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		/*
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		int i = 0;
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			nums[i] = it.next();
			i++;
		}
		return set.size();
		*/
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 0, 0, 3, 3 };
		int len = Solution.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.err.print(nums[i] + " ");
		}
	}
}