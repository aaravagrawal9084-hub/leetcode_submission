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
    public TreeNode sortedArrayToBST(int[] arr) {
        TreeNode x = dfs(arr,0,arr.length-1);
        return x;
    }
    public TreeNode dfs(int[] arr,int lo,int hi){
        if(lo>hi) return null;
        int mid = lo+(hi-lo)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = dfs(arr,lo,mid-1);
        root.right = dfs(arr,mid+1,hi);
        return root;
    }
}