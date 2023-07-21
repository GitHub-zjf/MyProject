package daily.s1302;


import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Solution {
    public Map<Integer, Integer> map = new HashMap<>();
    public int max;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return map.get(max);
    }

    void dfs(TreeNode t, int depth) {
        if (t == null) {
            return;
        }
        max = Math.max(max, depth);
        map.put(depth, map.getOrDefault(depth, 0) + t.val);
        dfs(t.left, depth + 1);
        dfs(t.right, depth + 1);
    }

}