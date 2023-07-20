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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        //storing all the values in a set respectively.
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        inOrder(root1, a);
        inOrder(root2, b);

        // iterating throught set a & subsequently checking if target - elment in a
        // exists in b.
        for(int num: a){
            if(b.contains(target-num)){
                return true;
            }
        }

        return false;
    }

    // using in order traversal
    private void inOrder(TreeNode node, Set<Integer> s){
        if(node == null){
            return;
        }

        inOrder(node.left, s);
        s.add(node.val);
        inOrder(node.right, s);
    }
}
