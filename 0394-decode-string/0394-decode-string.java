class Solution {
    public String decodeString(String s) {
        Stack<Integer> stnum = new Stack<>();
        Stack<StringBuilder> stsb = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            else if(ch=='['){
                stsb.push(sb);
                sb = new StringBuilder();
                stnum.push(num);
                num = 0;
            }
            else if(ch==']'){
                int n = stnum.pop();
                StringBuilder temp = stsb.pop();
                for(int j =1;j<=n;j++){
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