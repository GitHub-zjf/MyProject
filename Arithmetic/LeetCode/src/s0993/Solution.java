package s0993;

class Solution {
	public boolean isCousins(TreeNode root, int x, int y) {

		return false;
	}

	public TreeNode findVal(TreeNode root, int z) {
		return null;
	}

	public static void main(String[] args) {
		TreeNode leaf4 = new TreeNode(4);

		TreeNode leaf3 = new TreeNode(3);

		TreeNode leaf2 = new TreeNode(2, leaf4, null);

		TreeNode leaf1 = new TreeNode(1, leaf2, leaf3);

		new Solution().isCousins(leaf1, 4, 2);
	}
}