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
    public void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        dfs(root,q);
        while(q.size()!=0){
            TreeNode front = q.remove();
            front.left = null;
            front.right = q.peek();
        }
    }
    public static void dfs(TreeNode root,Queue<TreeNode> q){
        if(root==null){
            return;
        }
        q.add(root);
        dfs(root.left,q);
        dfs(root.right,q);
    }
}