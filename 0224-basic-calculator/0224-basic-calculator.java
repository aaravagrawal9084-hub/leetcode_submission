class Solution {
    int i = 0;
    public int calculate(String s) {
        int num = 0;
        int ans  =0;
        int sign =1;
        while(i<s.length()){
            char ch = s.charAt(i);
            i++;
            if(Character.isDigit(ch)){
                num = num *10 + (ch-'0');
            }
            else if(ch=='+'){
                ans = ans + (num*sign);
                num = 0;
                sign =1;
            }
            else if(ch=='-'){
                ans = ans + (num * sign);
                num = 0;
                sign= -1;
            }
            else if(ch=='('){
                num = calculate(s);

            }
            else if(ch==')'){
                ans=  ans +(num*sign);
                return ans;
            }
        }
        ans = ans+(num*sign);
        return ans;
    }
}
