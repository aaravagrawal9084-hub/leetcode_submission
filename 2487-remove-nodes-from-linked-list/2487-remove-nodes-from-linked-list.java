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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        st.push(head.val);
        while(temp!=null){
            if(st.size()!=0 && temp.val>st.peek()){
                while(st.size()!=0 && temp.val>st.peek()){
                    st.pop();
                } 
            }
            st.push(temp.val);
            temp = temp.next;
        }
        while(st.size()!=0){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
    }
}