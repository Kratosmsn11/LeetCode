/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    // this map holds value of the old nodes as keys with corresponding to holding new nodes as values
    HashMap<Node, Node> visitedNode = new HashMap<>();

    public Node copyRandomList(Node head) {
        
        if(head == null){
            return null;
        }

        if(this.visitedNode.containsKey(head)){
            return visitedNode.get(head);
        }

        Node node = new Node(head.val, null, null);

        this.visitedNode.put(head, node);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
