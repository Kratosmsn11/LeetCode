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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // checking if both of the TreeNodes are null.
        if(p == null && q == null){
            return true;
        }

        // if any one of the node is null or the value values are different.
        if(p == null || q == null || p.val != q.val){
            return false;
        }

        // checking for the left and right subtrees simultaneously.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
