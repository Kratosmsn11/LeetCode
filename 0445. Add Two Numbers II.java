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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // reversing the given list
        ListNode r1 = reverseList(l1);
        ListNode r2 = reverseList(l2);

        // declaring the variables needed
        int sum = 0, carry = 0;
        ListNode res = new ListNode();

        // will run the loop till the time both the lists are not null
        while(r1 != null || r2 != null){

            // checking & adding the value to sum
            if(r1 != null){
                sum += r1.val;
            }
            if(r2 != null){
                sum += r2.val;
            }

            res.val = sum % 10;
            carry = sum / 10;

            ListNode head = new ListNode(carry);
            head.next = res;
            res = head;
            sum = carry;

            r1 = r1 != null ? r1.next : null;
            r2 = r2 != null ? r2.next : null;
        }

        return carry == 0 ? res.next : res;
    }

    private ListNode reverseList(ListNode l){
        ListNode prev = null;
        ListNode temp;

        while(l != null){
            // storing the next node
            temp = l.next;
            
            // reversing the next node
            l.next = prev;

            //updating the pevious & the current node
            prev = l;
            l = temp;
        }

        return prev;
    }
}
