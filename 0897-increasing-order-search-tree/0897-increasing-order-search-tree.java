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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        dfs(root,ans);
        for(int i = 0 ;i<ans.size()-1;i++){
            ans.get(i).left = null;
            ans.get(i).right = ans.get(i + 1);
        }
        ans.get(ans.size()-1).left = null;
        ans.get(ans.size()-1).right = null;
        return ans.get(0);
    }
    public void dfs(TreeNode root,ArrayList<TreeNode> ans){
        if(root==null){
            return;
        }
        dfs(root.left,ans);
        ans.add(root);
        dfs(root.right,ans);
    }
}