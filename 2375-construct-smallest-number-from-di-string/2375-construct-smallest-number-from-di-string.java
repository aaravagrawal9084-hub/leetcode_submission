class Pair{
    char ch;
    int idx;
    Pair(char ch,int idx){
        this.ch = ch;
        this.idx = idx;
    }
}
class Solution {
    public String smallestNumber(String s) {
        int count = 1;
        Stack<Pair> st = new Stack<>();
        int[] arr = new int[s.length()+1];
        String k = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='D'){
                st.push(new Pair(ch,i));
            }
            if(ch=='I'){
                arr[i] = count++;
                while(st.size()!=0){
                    arr[st.peek().idx]=count++;
                    st.pop();
                }
            }
        }
        int back = arr.length-1;
        while(back>=0 && arr[back]==0){
            arr[back] = count++;
            back--;
        }
        for(int i = 0;i<arr.length;i++){
            k = k + arr[i];
        }
        return k;
        

    }
}