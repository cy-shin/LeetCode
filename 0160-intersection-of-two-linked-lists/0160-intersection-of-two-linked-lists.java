/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {     
        
        int lengthA = 0;
        int lengthB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }

        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }

        if(lengthA > lengthB){
            for(int i=0; i<lengthA - lengthB; i++){
                headA = headA.next;
            }
        }

        if(lengthA < lengthB){
          for(int i=0; i<lengthB - lengthA; i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;

    }
}