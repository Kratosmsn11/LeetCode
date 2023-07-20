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
    public boolean findTarget(TreeNode root, int k) {
        // creating a set to store all the node values in "In Order" sequence
        // of traversal.
        Set<Integer> treeInSet = new HashSet<>();
        return helper(treeInSet, root, k);
    }

    private boolean helper(Set<Integer> treeInSet, TreeNode node, int k){
        // base case
        if(node == null){
            return false;
        }
        if(treeInSet.contains(k - node.val)){
            return true;
        }

        treeInSet.add(node.val);
        return helper(treeInSet, node.left, k) || helper(treeInSet, node.right, k);
    }
}
