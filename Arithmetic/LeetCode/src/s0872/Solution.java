package s0872;

import java.util.LinkedList;
import java.util.List;

class Solution {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		eachTree(list1, root1);
		eachTree(list2, root2);
		return list1.equals(list2);
	}

	public void eachTree(List<Integer> list, TreeNode node) {
		if (null == node)
			return;
		if (null != node.left)
			eachTree(list, node.left);
		if (null != node.right)
			eachTree(list, node.right);
		if (null == node.left && null == node.right){
			list.add(node.val);
			return;
		}
	}

	public static void main(String[] args) {
		TreeNode tn14_1 = new TreeNode(7);
		TreeNode tn14_2 = new TreeNode(4);
		TreeNode tn13_1 = new TreeNode(6);
		TreeNode tn13_2 = new TreeNode(2, tn14_1, tn14_2);
		TreeNode tn13_3 = new TreeNode(9);
		TreeNode tn13_4 = new TreeNode(8);
		TreeNode tn12_1 = new TreeNode(5, tn13_1, tn13_2);
		TreeNode tn12_2 = new TreeNode(1, tn13_3, tn13_4);
		TreeNode root1 = new TreeNode(3, tn12_1, tn12_2);

		TreeNode tn24_1 = new TreeNode(9);
		TreeNode tn24_2 = new TreeNode(8);
		TreeNode tn23_1 = new TreeNode(6);
		TreeNode tn23_2 = new TreeNode(7);
		TreeNode tn23_3 = new TreeNode(4);
		TreeNode tn23_4 = new TreeNode(2, tn24_1, tn24_2);
		TreeNode tn22_1 = new TreeNode(5, tn23_1, tn23_2);
		TreeNode tn22_2 = new TreeNode(1, tn23_3, tn23_4);
		TreeNode root2 = new TreeNode(3, tn22_1, tn22_2);

		System.out.println(new Solution().leafSimilar(root1, root2));
	}
}