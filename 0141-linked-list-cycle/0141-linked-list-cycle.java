/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean result = false;

        Set<ListNode> set = new HashSet<>();

        if(head!=null){
            result = findCycle(head, set);
        }

        return result;
    }

    public boolean findCycle(ListNode head, Set<ListNode> set){
        if(head.next == null) return false;
        
        if(head.next != null){
            if(set.contains(head.next)) return true;
            set.add(head.next);
        }       

        return findCycle(head.next, set);
    }
}