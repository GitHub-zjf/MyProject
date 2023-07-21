package daily.s1614;

class Solution {
	public int maxDepth(String s) {
		int maxDepth = 0;
		int depth = 0;
		String left = "(";
		String right = ")";
		String[] split = s.split("");
		for (String sp : split) {
			if (left.equals(sp)) {
				depth++;
			} else if (right.equals(sp)) {
				depth--;
			}
			maxDepth = Math.max(maxDepth, depth);
		}
		return maxDepth;
	}

	public static void main(String[] args) {
		String s = "1";
		System.out.println(new Solution().maxDepth(s));
	}
}