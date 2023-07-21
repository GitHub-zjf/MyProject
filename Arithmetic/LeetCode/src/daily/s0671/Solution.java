package daily.s0671;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
    	Set<Integer> set = new HashSet<>();
    	addVal(root, set);
    	Integer[] array = set.toArray(new Integer[0]);
    	if(array.length > 1){
    		Arrays.sort(array);
    		return array[1];
    	}else{
    		return -1;
    	}
    }
    
    public void addVal(TreeNode root, Set<Integer> set){
    	if(null == root){
    		return;
    	}else{
    		set.add(root.val);
    		addVal(root.left, set);
    		addVal(root.right, set);
    	}
    }
}