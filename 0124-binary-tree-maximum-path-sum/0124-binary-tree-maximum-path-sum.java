class Solution {
    static int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        dfs(root);
        return maxsum;
    }
    public static int dfs(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            maxsum = Math.max(maxsum, root.val);
            return Math.max(0, root.val);
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        maxsum = Math.max(maxsum, root.val);
        maxsum = Math.max(maxsum, root.val + left);
        maxsum = Math.max(maxsum, root.val + right);
        maxsum = Math.max(maxsum, root.val + left + right);
        return root.val + Math.max(0, Math.max(left, right));
    }
}