class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            String s = arr[i];
            if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("+")){
               int x = st.pop();
               int y = st.pop();
               int z = x +y;
               st.push(y);
               st.push(x);
               st.push(z);
            }
            else if (Character.isDigit(s.charAt(0)) || s.charAt(0) == '-') {
                st.push(Integer.parseInt(s));
            }
        }
        int sum2 = 0;
        while(st.size()>0){
            sum2 = sum2 + st.pop();
        }
        return sum2;
    }
}