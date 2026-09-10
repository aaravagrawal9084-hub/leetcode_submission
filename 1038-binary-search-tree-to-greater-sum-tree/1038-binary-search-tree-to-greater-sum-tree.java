/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        dfs(root,ans);
        for(int i = ans.size()-2;i>=0;i--){
            ans.get(i).val = ans.get(i).val+ans.get(i+1).val;
        }
        return root;
    }
    public void dfs(TreeNode root,ArrayList<TreeNode> ans ){
        if(root==null) return;
        dfs(root.left,ans);
        ans.add(root);
        dfs(root.right,ans);
    }
}