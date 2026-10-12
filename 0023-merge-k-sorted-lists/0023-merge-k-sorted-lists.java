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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        for(int i = 0 ;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                ans.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(ans);
        for(int i = 0;i<ans.size();i++){
            a.next = new ListNode(ans.get(i));
            a = a.next;
        }
        return dummy.next;
    }
}