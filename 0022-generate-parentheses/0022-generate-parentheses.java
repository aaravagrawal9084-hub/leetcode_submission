class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Output("",ans,0,0,n);
        return ans;
    }
    private void Output(String s,List<String> ans,int l,int r,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(l<n){
            Output(s+"(",ans,l+1,r,n);
        }
        if(r<l){
            Output(s+")",ans,l,r+1,n);
        }
    }
}