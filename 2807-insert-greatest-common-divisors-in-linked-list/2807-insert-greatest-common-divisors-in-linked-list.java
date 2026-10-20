class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode temp = head;
        ListNode temp2 = head.next;
        while(temp2!=null){
            max = Integer.MIN_VALUE;
            int k = gcd(max,temp.val,temp2.val);
            ListNode m = new ListNode(k);
            temp.next = m;
            m.next = temp2;
            temp = temp.next.next;
            temp2 = temp2.next;
        }
        return head;
    }
    public static int gcd(int max,int x,int y){
        for(int i = 1;i<=Math.min(x,y);i++){
            if(x%i==0 && y%i==0){
                max = i;
            }
        }
        return max;
    } 

}