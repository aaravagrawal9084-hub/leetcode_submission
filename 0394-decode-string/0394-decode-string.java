class Solution {
    public String decodeString(String s) {
        Stack<Integer> stn = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num *10 + (ch-'0');
            }
            else if(ch=='['){
                st.push(sb);
                sb = new StringBuilder();
                stn.push(num);
                num =0;
            }
            else if(ch==']'){
                int n = stn.pop();
                StringBuilder temp = st.pop();
                for(int j = 1;j<=n;j++){
                    temp.append(sb);
                }
                sb = temp;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}