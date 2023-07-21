package daily.s0700;
/**
 * 	二叉搜索树满足如下性质：
 *	左子树所有节点的元素值均小于根的元素值；
 *	右子树所有节点的元素值均大于根的元素值。
 * @author zheng
 *
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
//    	if(root == null) return null;
//    	
//    	if(root.val == val) return root;
//    	
//    	if(root.left != null){
//    		TreeNode left = searchBST(root.left, val);
//        	if(left != null){
//        		return left;
//        	}
//    	}
//    	
//    	if(root.right != null){
//    		TreeNode rigth = searchBST(root.right, val);
//        	if(rigth != null){
//        		return rigth;
//        	}
//    	}
//    	
//    	return null;
    	while (root != null) {
            if (val == root.val) {
                return root;
            }
            root = val < root.val ? root.left : root.right;
        }
        return null;
    }
    
    public static void main(String[] args) {
		
	}
}