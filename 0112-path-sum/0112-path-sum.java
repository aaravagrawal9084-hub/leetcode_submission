class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
       return dfs(root,target,0);
    }
    public static boolean dfs(TreeNode root,int target,int count){
        if(root == null){
            return false;
        }
        if(root.left==null && root.right==null && (count + root.val) == target){
            return true;
        }
        if(root.left==null && root.right==null && (count + root.val) != target){
            return false;
        }
        boolean left = dfs(root.left,target,count+root.val);
        boolean right = dfs(root.right,target,count+root.val);
        return (left || right);
    }
}