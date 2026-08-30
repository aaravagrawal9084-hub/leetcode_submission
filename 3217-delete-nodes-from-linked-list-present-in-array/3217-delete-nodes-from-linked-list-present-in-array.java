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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode a = dummy;
        ListNode temp = head;
        while(temp!=null){
            if(!set.contains(temp.val)){
                a.next = temp;
                a = a.next;
            }
            temp = temp.next;
        }
        a.next = null;
        return dummy.next;

    }
}