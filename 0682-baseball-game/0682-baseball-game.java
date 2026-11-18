class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("C")){
                st.pop();
            }
            else if(arr[i].equals("D")){
                int x = st.pop();
                int y = 2 * x;
                st.push(x);
                st.push(y);
            }
            else if(arr[i].equals("+")){
                int x = st.pop();
                int y = st.pop();
                int z = x+y;
                st.push(y);
                st.push(x);
                st.push(z);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int sum=0;
        while(st.size()!=0){
        sum = sum + st.pop();
    }
    return sum;
        
    }
    
}