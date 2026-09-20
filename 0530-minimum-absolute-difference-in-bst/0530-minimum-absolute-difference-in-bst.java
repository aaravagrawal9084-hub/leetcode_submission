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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans  = new ArrayList<>();
        dfs(root,ans);
        int ff = Integer.MAX_VALUE;
        int diff = 0;
        for(int i =0;i<ans.size()-1;i++){
           diff = 0;
            diff = ans.get(i+1) - ans.get(i);
            ff = Math.min(ff,diff);
        }
        return ff;
    }
    public void dfs(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}