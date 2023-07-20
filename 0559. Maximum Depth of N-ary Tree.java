/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        // base case
        if(root == null){
            return 0;
        }
        
        int maxDepth = 0;
        // iterating through the children node and updating the maxDepth variable if
        // the children node have more depth than the current.
        for(Node n : root.children){
            maxDepth = Math.max(maxDepth, maxDepth(n));
        }

        return maxDepth + 1;
    }
}
