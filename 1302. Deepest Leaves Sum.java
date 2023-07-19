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

    int res = 0;
    public int deepestLeavesSum(TreeNode root) {
        int depth = maxDepth(root);
        maxDepthSum(root, 1, depth);
        
        return res;
    }

    private int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }

    
    private void maxDepthSum(TreeNode node, int current, int depth){
        if(node != null){
            if(current == depth){
                res += node.val;
            }

            maxDepthSum(node.left, current+1, depth);
            maxDepthSum(node.right, current+1, depth);
        }
    }
}
