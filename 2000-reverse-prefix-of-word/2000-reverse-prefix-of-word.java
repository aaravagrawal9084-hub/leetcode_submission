class Solution {
    public String reversePrefix(String s, char h) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int idx = -1;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==h){
                st.push(ch);
                idx = i;
                break;
            }
            else{
                st.push(ch);
            }
        }
        if(idx==-1){
            return s;
        }
        while(st.size()!=0 ){
            sb.append(st.pop());
        }
        for(int i = idx+1 ;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}