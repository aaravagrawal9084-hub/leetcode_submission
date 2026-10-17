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
        if(head==null || head.next==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null) return head.next;
        while(fast!=null){
            slow = slow.next;
            a = a.next;
            fast = fast.next;
        }
        a.next = a.next.next;
        return head;
    }
}