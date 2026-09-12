class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
        ListNode a = head;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        temp = head;
        k = k%length;
        if(k==0){
            return head;
        }
        for(int i = 1;i<length-k;i++){
            fast = fast.next;
        }
        slow = fast;
        fast = fast.next;
        slow.next = null;
         a = fast;
        while(fast.next!=null){
            fast = fast.next;
        }
        fast.next = head;
        return a;
    }
}