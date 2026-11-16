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
        if(head==null) return null;
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp);
            temp = temp.next;
        }
        ListNode y = st.peek();
        while(st.size()!=0){
            ListNode x = st.pop();
            if(st.size()==0){
                x.next=null;
            }
            if(st.size()!=0) x.next = st.peek();
            
        }
        return y;
    }
}