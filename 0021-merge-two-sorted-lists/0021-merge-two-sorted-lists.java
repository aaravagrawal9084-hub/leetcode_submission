class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head1;
        ListNode temp2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        while(temp!=null){
            ans.add(temp.val);
            temp = temp.next;
        }
        while(temp2!=null){
            ans.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(ans);
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
    }
}