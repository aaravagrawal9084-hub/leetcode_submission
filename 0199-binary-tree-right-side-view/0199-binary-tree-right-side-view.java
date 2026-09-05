class Solution {
    public static void dfs(TreeNode root,ArrayList<Integer> ans,int levl){
        if(root==null){
            return;
        }
        ans.set(levl,root.val);
        dfs(root.left,ans,levl+1);
        dfs(root.right,ans,levl+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int level = levels(root);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<level;i++){
            ans.add(0);
        }
        dfs(root,ans,0);
        return ans;
    }
    public int levels(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 + Math.max(levels(root.left),levels(root.right)); 
    }
}