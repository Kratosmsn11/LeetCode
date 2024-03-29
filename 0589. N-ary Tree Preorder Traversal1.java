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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
    
        return traverse(root, res);
    }

    public List<Integer> traverse(Node child, List<Integer> res){
        if(child == null){
            return res;
        }

        res.add(child.val);
        for(Node c : child.children){
            traverse(c, res);
        }

        return res;
    }
}
