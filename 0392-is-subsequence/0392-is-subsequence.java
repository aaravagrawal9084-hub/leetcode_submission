class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = s.length()-1;i>=0;i--){
            st1.push(s.charAt(i));
        }
        for(int i = t.length()-1;i>=0;i--){
            st2.push(t.charAt(i));
        }
        while(st1.size()!=0 && st2.size()!=0){
            if(st1.peek()==st2.peek()){
                st1.pop();
                st2.pop();
            }
            else if(st1.peek()!=st2.peek()){
                while(st2.size()!=0 && (st2.peek()!=st1.peek())){
                    st2.pop();
                }
            }
        }
        return st1.size()==0;

        
    }
}