class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        while(temp!=null){
            ans.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ans);
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
    }
}