package s1609;

import java.util.LinkedList;
import java.util.List;

class Solution {
	public boolean isEvenOddTree(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();

		return true;
	}

	public void preOrderTraverse(TreeNode root, List<List<Integer>> list) {
		List<Integer> tempList = new LinkedList<Integer>();
		if (root != null) {
			tempList.add(root.val);
			list.add(tempList);
			preOrderTraverse(root.left, list);
			preOrderTraverse(root.right, list);
		}
	}

	// [1,10,4,3,null,7,9,12,8,6,null,null,2]
	public static void main(String[] args) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode8 = new TreeNode(8);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode12 = new TreeNode(12);

		TreeNode treeNode3 = new TreeNode(3, treeNode12, treeNode8);
		TreeNode treeNode7 = new TreeNode(7, treeNode6, null);
		TreeNode treeNode9 = new TreeNode(9, null, treeNode2);

		TreeNode treeNode10 = new TreeNode(10, treeNode3, null);
		TreeNode treeNode4 = new TreeNode(4, treeNode7, treeNode9);
		TreeNode treeNode1 = new TreeNode(1, treeNode10, treeNode4);

		new Solution().preOrderTraverse(treeNode1, list);
		System.out.println(1);
		System.out.println(2);
	}
}