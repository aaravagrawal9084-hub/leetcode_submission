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
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode dummy  = new ListNode(-1);
        ListNode a = dummy;
        if(head == null || head.next==null){
            return head;
        }
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp);
            temp = temp.next;
        }
        Collections.reverse(ans);
        for(int i = 0 ;i<ans.size();i++){
            a.next =ans.get(i);
            a = a.next; 
        }
        a.next = null;
        return dummy.next;
        
    }
}