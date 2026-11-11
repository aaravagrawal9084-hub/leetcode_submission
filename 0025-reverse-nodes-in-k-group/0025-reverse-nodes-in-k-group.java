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
        Stack<ListNode> st  = new Stack<>();
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        Stack<ListNode> pt = new Stack<>();
        while(temp!=null){
            if(st.size()==k){
                while(st.size()!=0){
                    a.next = st.pop();
                    a = a.next;
                }
                st.push(temp);
            }
            else{
                st.push(temp);
            }
            temp = temp.next;
        }
        if(st.size()==k){
            while(st.size()!=0){
                a.next = st.pop();
                a =a.next;
            }
        }
        
        while(st.size()!=0){
            pt.push(st.pop());
        }
        while(pt.size()!=0){
            a.next = pt.pop();
            a =a.next;
        }
        a.next = null;
        return dummy.next;
    }
}