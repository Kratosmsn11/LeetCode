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
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int res = 0, level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while(!q.isEmpty()){
            level++;
            int sumCurr = 0;

            for(int s = q.size(); s > 0; s--){
                TreeNode node = q.poll();
                sumCurr += node.val;
            

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }
            if(maxSum < sumCurr){
                maxSum = sumCurr;
                res = level;
            }
        }

        return res;
    }
}
