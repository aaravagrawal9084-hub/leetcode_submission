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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        if(root==null){
            return new TreeNode(val);
        }
        while(temp!=null){
            if(temp.val<val && temp.right!=null){
                temp = temp.right;
            }
            else if(temp.val<val && temp.right==null){
                temp.right = new TreeNode(val);
                break;
            }
            else if(temp.val>val && temp.left!=null ){
                temp = temp.left;
            }
            else if(temp.val>val && temp.left==null){
                temp.left = new TreeNode(val);
                break;
            }
        }
        return root;
    }
}