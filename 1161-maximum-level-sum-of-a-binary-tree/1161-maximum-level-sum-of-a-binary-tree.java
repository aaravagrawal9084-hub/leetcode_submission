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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> List = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int prevlevel = 0;
        q.add(new Pair(root,0));
        int max = Integer.MIN_VALUE;
        int sum  = 0;
        int idx = 0;
        int x = 0;
        while(q.size()!=0){
            Pair front = q.remove();
            x = front.level;
            TreeNode left = front.node.left;
            TreeNode right = front.node.right;
            if(front.level!=prevlevel){
                if(sum>max){
                    max = sum;
                    idx = front.level;
                }
                prevlevel++;
                List = new ArrayList<Integer>();
                sum = 0;
            }
            sum = sum + front.node.val;
            List.add(front.node.val);
            if(left!=null) q.add(new Pair(left,front.level+1));
            if(right!=null) q.add(new Pair(right,front.level+1));
        }
        if(sum>max){
            idx = x+1;
        }
        return idx; 
    }
}