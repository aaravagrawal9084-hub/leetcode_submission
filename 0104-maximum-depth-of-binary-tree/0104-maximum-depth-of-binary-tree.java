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
    public int maxDepth(TreeNode root) {
        return dfs(root,0);
    }
    public static int dfs(TreeNode root,int maxcount){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left = dfs(root.left,maxcount);
        int right = dfs(root.right,maxcount);
        maxcount = Math.max(maxcount,Math.max(left,right));
        return 1 + maxcount;
    }

}