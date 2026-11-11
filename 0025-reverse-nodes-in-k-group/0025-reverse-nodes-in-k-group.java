
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;

        // Check whether k nodes exist
        for(int i = 0; i < k; i++) {
            if(temp == null) {
                return head;
            }
            temp = temp.next;
        }

        // Reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;

        for(int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Recursive call for remaining nodes
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
