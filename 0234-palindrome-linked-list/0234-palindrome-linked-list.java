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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        // 1. find center
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.val);
        }

        // 2. reverse from next of center to end
        ListNode reverse = null;
        ListNode curr = slow.next;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = reverse;
            reverse = curr;
            curr = temp;
        }
        
        // 3. compare two
        while(reverse!=null){
            if(reverse.val != head.val) return false;
            reverse = reverse.next;
            head = head.next;
        }
        
        return true;
    }

}