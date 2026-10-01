class Pair {
    int val;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.idx = idx;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(arr[0],0));
        for(int i = 1;i<arr.length;i++){
            while(st.size()!=0 && st.peek().val<arr[i]){
                arr[st.peek().idx] = i - st.peek().idx;
                st.pop();
            }
            st.push(new Pair(arr[i],i));
            
        }
        while(st.size()!=0){
            arr[st.pop().idx] = 0;
        }
        return arr;
    }
}