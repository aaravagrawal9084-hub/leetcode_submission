
class Solution {
    public int numComponents(ListNode head, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null){
            if (set.contains(temp.val) &&
                (temp.next == null || !set.contains(temp.next.val))) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}
