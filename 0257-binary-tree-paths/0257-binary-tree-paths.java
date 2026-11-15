
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }
    public void dfs(TreeNode root, String path, ArrayList<String> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path += root.val;
            ans.add(path);
            return;
        }
        path += root.val;
        path += "->";
        dfs(root.left, path, ans);
        dfs(root.right, path, ans);
    }
}
