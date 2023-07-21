package daily.s0589;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<Integer> preorder(Node root) {
		List<Integer> ret = new ArrayList<Integer>();

		if (root != null) {
			ret.add(root.val);
			List<Node> children = root.children;
			if (children != null && children.size() > 0) {
				for (Node node : children) {
					ret.addAll(preorder(node));
				}
			}
		}
		return ret;
	}
}