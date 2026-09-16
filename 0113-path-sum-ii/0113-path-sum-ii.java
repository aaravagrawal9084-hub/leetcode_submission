class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,targetSum,arr,ans);
        return ans;
    }
    public void dfs(TreeNode root, int targetSum,ArrayList<Integer> arr,ArrayList<List<Integer>> ans){
        if(root==null){
            return;
        }
        ArrayList<Integer> list = new ArrayList<Integer>(arr);
        list.add(root.val);
        if(root.left==null && root.right==null && (targetSum-root.val)==0){
            ans.add(list);
            return;
        }
        targetSum = targetSum - root.val;
        dfs(root.left,targetSum,list,ans);
        dfs(root.right,targetSum,list,ans);
    }
}