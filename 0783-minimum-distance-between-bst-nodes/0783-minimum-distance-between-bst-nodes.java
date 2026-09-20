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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        int diff = Integer.MAX_VALUE ;
        for(int i = 0;i<ans.size()-1;i++){
            diff = Math.min(diff,(ans.get(i+1)-ans.get(i)));
        }
        return diff;
    }
    public void dfs(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return ;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}