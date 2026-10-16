class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i  =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if((Character.isDigit(ch)) && !Character.isDigit(st.peek())){
                st.pop();
            }
            else{
                st.push(ch);
            }  
        }
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}