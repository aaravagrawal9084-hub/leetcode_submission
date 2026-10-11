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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(size(head)<k){
            return head;
        }
        ListNode p = null;
        ListNode c = head;
        int count = 0;
        while(count < k){
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
            count++;
        }
        if(c!=null){
            head.next = reverseKGroup(c,k);
        }
        return p;
    }

    public static int size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}