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

//Time complexity O(n^2)
// want to use reccursion
class Solution {
    public int diameterOfBinaryTree(TreeNode root, String indent) {
        // base case could be either null or leaf node
        if(root == null) return 0;

        int leftDm = diameterOfBinaryTree(root.left, indent+"  ");
        int rightDm = diameterOfBinaryTree(root.right, indent+"  ");

        int thruTheRoot = height(root.left) + height(root.right);

        return (Math.max(thruTheRoot,Math.max(leftDm,rightDm)));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameterOfBinaryTree(root, "");
    }

    // need to check the left and right side of the tree
    private int height(TreeNode root){
        if(root == null) return 0;
      
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right)+1;
    }
}
