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

        // solving using the iterative method
        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        // using a stack to store the nodes
        Stack<Node> s =  new Stack<>();
        s.push(root);

        while(!s.empty()){
            Node n = s.pop();
            res.add(n.val);

            // adding all the children in the stack (Note: have to traverse in reverse order)
            for(int i = n.children.size()-1; i >= 0; i--){
                Node child = n.children.get(i);
                s.push(child);
            }
        }

        return res;
    }
}
