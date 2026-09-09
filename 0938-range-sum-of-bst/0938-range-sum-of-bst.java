class Solution {
    public int rangeSumBST(TreeNode root, int l, int h) {
        if(root==null) return 0;
        int sum = 0;
        if(root.val<=h && root.val>=l){
            sum = sum + root.val;
        }
        sum = sum + rangeSumBST(root.left,l,h);
        sum = sum + rangeSumBST(root.right,l,h);
        return sum;
    }
}