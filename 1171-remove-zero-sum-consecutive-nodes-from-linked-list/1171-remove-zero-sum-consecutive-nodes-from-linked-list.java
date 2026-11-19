class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode curr = dummy;
        // First traversal
        while (curr != null) {
            sum += curr.val;
            map.put(sum, curr);
            curr = curr.next;
        }
        // Second traversal
        sum = 0;
        curr = dummy;
        while (curr != null) {
            sum += curr.val;
            curr.next = map.get(sum).next;
            curr = curr.next;
        }
        return dummy.next;
    }
}
