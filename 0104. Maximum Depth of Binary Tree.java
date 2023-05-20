/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root);
    }

    private int depth(TreeNode root){
        if(root.left == null && root.right == null) return 1;

        int left = 0, right = 0;
        left = root.left != null ? depth(root.left) : 0;
        right = root.right != null ? depth(root.right) : 0;

        return Math.max(left, right) + 1;
    }
}
