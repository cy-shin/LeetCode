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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;

        while(curr!=null){
            curr = curr.next;
            length++;
        }

        ListNode newHead = new ListNode();
        curr = newHead;

        while(head!=null){
            if(length!=n){
                ListNode next = new ListNode(head.val);
                curr.next = next;
                curr = curr.next;
            }
            head = head.next;
            length--;
        }

        return newHead.next;

  
    }
}