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

    private HashMap<Integer, List<TreeNode>> tracker = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        // base case 1 : where n is even.
        // there cannot exist a tree binary tree with even number of nodes.
        if(n % 2 == 0){
            return new ArrayList<>();
        }

        // base case 2 : where n is 1.
        // in this case the tree will only be a node.
        if(n == 1){
            return Arrays.asList(new TreeNode());
        }

        if(tracker.containsKey(n)){
            return tracker.get(n);
        }

        List<TreeNode> res = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);

            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(0, l, r);
                    res.add(root);
                }
            }
        }

        tracker.put(n, res);
        return res;
    }
}
