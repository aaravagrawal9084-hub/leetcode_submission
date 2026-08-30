class Solution {
    public ListNode mergeInBetween(ListNode head1, int a, int b, ListNode head2) {
        ListNode temp = head2;
        ListNode a1 = head1;
        ListNode b1 = head1;
        ListNode k = head1;
        for(int i = 1;i<a;i++){
            a1 = a1.next;
        }
        for(int i = 1;i<=b;i++){
            b1 = b1.next;
        }
        k = b1.next;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = k;
        a1.next = head2;
        b1.next = null;
        return head1;
        

    }
}