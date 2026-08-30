class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        int carry = 0;
        ListNode c = head;
        ListNode p = null;
        ListNode f = null;
        while(c!=null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        while(p!=null){
            if(p.val>=5){
                ans.add(((p.val*2)%10)+carry);
                carry = 1;
            }
            else{
                ans.add(((p.val*2)%10)+carry);
                carry = 0;
            }
            p = p.next;
        }
        if(carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        System.out.print(ans);
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
    }
}