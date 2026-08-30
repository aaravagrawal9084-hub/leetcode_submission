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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] krr = new int[m][n];
        for(int i = 0;i<krr.length;i++){
            for(int j = 0;j<krr[0].length;j++){
                krr[i][j] = -1;
            }
        }
        ListNode temp = head;
        int fr = 0, lr = m-1, fc = 0, lc = n-1;
        while(temp!=null){
        for(int i =fc;i<=lc;i++){
            if(temp==null){
                return krr;
            }
            krr[fr][i]=temp.val;
            temp = temp.next;
        }
        fr++;
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = fr;i<=lr;i++){
            if(temp==null){
                return krr;
            }
            krr[i][lc] = temp.val;
            temp = temp.next;
        }
        lc--;
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = lc;i>=fc;i--){
            if(temp==null){
                return krr;
            }
            krr[lr][i] = temp.val;
            temp = temp.next;
        }
        lr--; 
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = lr;i>=fr;i--){
            if(temp==null){
                return krr;
            }
            krr[i][fc] = temp.val;
            temp = temp.next;
        }
        fc++;
        if(fr>lr || fc>lc){
            break;
        }
        }    
        return krr;
    }
}