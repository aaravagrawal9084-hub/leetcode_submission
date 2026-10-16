class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(  (ch=='B' && st.size()!=0 && st.peek()=='A') || (ch=='D' && st.size()!=0 && st.peek()=='C')){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
        
    }
}