package daily.s0655;

import java.util.ArrayList;
import java.util.List;


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

class Solution {
    public List<List<String>> printTree(TreeNode root) {
        // 先求出树的高度
        int height = treeHeight(root);
        // 求出行和列的数量
        int m = height + 1;
        int n = (1 << (height + 1)) - 1;
        // 初始化矩阵
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add("");
            }
            res.add(row);
        }
        // 深度优先遍历
        dfs(res, root, 0, (n - 1) / 2, height);
        return res;
    }

    public int treeHeight(TreeNode root) {
        int h = 0;
        if (root.left != null) {
            h = Math.max(h, treeHeight(root.left) + 1);
        }
        if (root.right != null) {
            h = Math.max(h, treeHeight(root.right) + 1);
        }
        return h;
    }

    public void dfs(List<List<String>> res, TreeNode root, int r, int c, int height) {
        res.get(r).set(c, root.val + "");
        if (root.left != null) {
            dfs(res, root.left, r + 1, c - (1 << (height - r - 1)), height);
        }
        if (root.right != null) {
            dfs(res, root.right, r + 1, c + (1 << (height - r - 1)), height);
        }
    }

}