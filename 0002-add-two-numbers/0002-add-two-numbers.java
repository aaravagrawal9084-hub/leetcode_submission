class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int x = temp1.val+temp2.val;
            ans.add((x+carry)%10);
            if((x+carry)>=10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp2!=null){
            while(temp2!=null){
                int y = temp2.val+carry;
                ans.add((temp2.val+carry)%10);
                if(y>9){
                    carry = 1;
                }
                else carry = 0;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null){
            while(temp1!=null){
                int y = temp1.val+carry;
                ans.add((temp1.val+carry)%10);
                if(y>9){
                    carry = 1;
                }
                else carry = 0;
                temp1 = temp1.next;
            }
        }
        if(carry == 1) ans.add(carry);
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
        
    }
}