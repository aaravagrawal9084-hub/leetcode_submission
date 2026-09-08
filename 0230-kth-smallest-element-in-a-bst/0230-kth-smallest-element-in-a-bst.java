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
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> q = new LinkedList<>();
        dfs(root,k,q);
        int temp = 1;
        while(temp<k){
            q.poll();
            temp++;
        }
        return q.peek();
    }
    public void dfs(TreeNode root,int k,Queue<Integer> q){
        if(root==null){
            return;
        }
        dfs(root.left,k,q);
        q.add(root.val);
        dfs(root.right,k,q);
        // if(root.right!=null) q.add(root.right.val);
    }
}