/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        List<ListNode> al = new ArrayList<>();
        ListNode tempNode = head;
        while(tempNode != null){
            al.add(tempNode);
            tempNode = tempNode.next;
        }
        for(int i = 0; i < al.size()-1; i += 2){
            int temp = al.get(i).val;
            al.get(i).val = al.get(i+1).val;
            al.get(i+1).val = temp;
        }
        return head;
    }
}
