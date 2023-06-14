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

    int res = Integer.MAX_VALUE;

    TreeNode prevNode;
    void inorderTraversal(TreeNode node){
        if(node == null){
            return;
        }

        inorderTraversal(node.left);
        if(prevNode != null){
            res = Math.min(res, node.val - prevNode.val);
        }

        prevNode = node;
        inorderTraversal(node.right);
    }


    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return res;
    }
}
