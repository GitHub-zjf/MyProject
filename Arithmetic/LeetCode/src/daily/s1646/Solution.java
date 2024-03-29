package daily.s1646;

class Solution {
//	public int getMaximumGenerated(int n) {
//		int max = 0;
//		if (n <= 1) {
//			return n;
//		}
//		int[] nums = new int[n + 1];
//		nums[0] = 0;
//		nums[1] = 1;
//
//		for (int i = 2; i <= n; i++) {
//			if (i % 2 == 0) {
//				nums[i] = nums[i / 2];
//			} else {
//				nums[i] = nums[i / 2] + nums[i / 2 + 1];
//			}
//			max = Math.max(max, nums[i]);
//		}
//
//		return max;
//	}
	
	public static void main(String[] args) {
		System.err.println(new Solution().getMaximumGenerated(100));
	}
	
	public int getMaximumGenerated(int n) {
		int max = 0;
		if (n <= 1) {
			return n;
		}
		int[] nums = new int[n + 1];
		nums[0] = 0;
		nums[1] = 1;

		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				nums[i] = nums[i / 2];
			} else {
				nums[i] = nums[i / 2] + nums[i / 2 + 1];
			}
			max = Math.max(max, nums[i]);
		}
		
		for(int i=0;i<=n;i++){
			System.out.println(i + ":" + nums[i]);
		}

		return max;
	}
}