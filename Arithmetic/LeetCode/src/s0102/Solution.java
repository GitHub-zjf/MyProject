package s0102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(null == root) return list;
		
		
		Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
		queue.add(root);
		list.add(Arrays.asList(root.val));
		
		while (!queue.isEmpty()) {
			List<Integer> tempList = new ArrayList<>();
			int size = queue.size();
			
			for(int i=0;i<size;i++){
				TreeNode tn = queue.poll();
				if(null != tn.left){
					queue.add(tn.left);
					tempList.add(tn.left.val);
				}
				if(null != tn.right){
					queue.add(tn.right);
					tempList.add(tn.right.val);
				}
			}
			
			if(tempList.size() > 0){
				list.add(tempList);
			}
		}
		
		
		return list;
	}
}