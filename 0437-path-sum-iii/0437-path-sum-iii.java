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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int x = dfs(root,targetSum);
        int y = pathSum(root.left,targetSum);
        int z  = pathSum(root.right,targetSum);
        return x + y + z;
    }
    public int dfs(TreeNode root, long remaining){
        if(root==null){
            return 0;
        }
        int count = 0;
        if((remaining-root.val)==0){
            count++;
        }
        count = count + dfs(root.left,remaining-root.val);
        count  = count + dfs(root.right,remaining-root.val);
        return count;
    }
}