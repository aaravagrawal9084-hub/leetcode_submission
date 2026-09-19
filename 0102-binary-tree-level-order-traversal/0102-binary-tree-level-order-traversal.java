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

class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        bfs(root,ans);
        return ans;
    }
    public void bfs(TreeNode root, ArrayList<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int pl = 0;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            if(front.level != pl){
                ans.add(list);
                pl++;
                list = new ArrayList<Integer>();
            }
            list.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,pl+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,pl+1));
        }
        ans.add(list);
    }
}
