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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode nextNode = second.next;

            second.next = prev;
            prev = second;

            second = nextNode;
        }

        ListNode fin = prev;
        ListNode start = head;
        while (fin != null) {
            ListNode temp1 = start.next;
            ListNode temp2 = fin.next;

            start.next = fin;
            fin.next = temp1;

            start = temp1;
            fin = temp2;
            
        }
        
    
        
    }
}
