class Solution {
    public List<String> buildArray(int[] target, int n) {
        HashSet<Integer> set = new HashSet<>();
        Stack<String> st = new Stack<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<target.length;i++){
            set.add(target[i]);
        }
        for(int i = 1;i<=n;i++){
            if(set.contains(i)){
                st.push("Push");
            }
            else if(i<target[target.length-1]){
                st.push("Push");
                st.push("Pop");
            }
        }
        while(st.size()!=0){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}