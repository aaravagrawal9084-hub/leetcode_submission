class Solution {
    public String minRemoveToMakeValid(String s) {
        class Pair{
            int idx;
            char ch;
            Pair(char ch,int idx){
                this.idx = idx;
                this.ch = ch;
            }
        }
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        Stack<Pair> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(new Pair(ch,i));
            }
            else if(st.size()!=0 && st.peek().ch=='(' && ch==')'){
                st.pop();
            }
            else if(ch=='(' || ch==')'){
                st.push(new Pair(ch,i));
                
            }
        }
        while(st.size()!=0){
            set.add(st.peek().idx);
            st.pop();
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(i)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}