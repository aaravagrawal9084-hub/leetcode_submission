class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int[] arr = new int[ans.size()];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1;i<ans.size();i++){
            if(st.size()!=0 && ans.get(st.peek())>ans.get(i)){
                st.push(i);
            }
            else{
                while(st.size()!=0 && ans.get(st.peek())<ans.get(i)){
                    arr[st.peek()] = ans.get(i);
                    st.pop();
                }
                st.push(i);
            }
        }
        return arr;

    }
}