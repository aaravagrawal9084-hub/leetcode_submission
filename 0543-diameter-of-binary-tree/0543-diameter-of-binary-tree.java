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
    static int maxcount = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxcount = 0;
        dfs(root,0);
        return maxcount;
    }
    public static int dfs(TreeNode root,int count){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left = dfs(root.left,count);
        int right = dfs(root.right,count);
        int sum = left + right;
        maxcount = Math.max(maxcount,sum);
        return Math.max(left,right)+1;

    }
}