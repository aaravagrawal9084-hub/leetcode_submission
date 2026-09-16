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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,0,ans);
        int sum = 0;
        for(int i = 0;i<ans.size();i++){
            sum = sum + ans.get(i);
        }
        return sum;
    }
    public void dfs(TreeNode root,int CurrentSum,ArrayList<Integer> ans){
        if(root==null) return;
        CurrentSum = CurrentSum * 10 + root.val;
        if(root.left==null && root.right==null){
            ans.add(CurrentSum);
            return;
        }
        dfs(root.left,CurrentSum,ans);
        dfs(root.right,CurrentSum,ans);
    }
}