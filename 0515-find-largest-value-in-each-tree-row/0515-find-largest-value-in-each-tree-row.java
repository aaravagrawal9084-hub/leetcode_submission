class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        ArrayList<Integer> List = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int prevlevel = 0;
        q.add(new Pair(root,0));
        int max = Integer.MIN_VALUE;
        while(q.size()!=0){
            Pair front = q.remove();
            TreeNode left = front.node.left;
            TreeNode right = front.node.right;
            if(front.level!=prevlevel){
                ans.add(max);
                prevlevel++;
                List = new ArrayList<Integer>();
                max = Integer.MIN_VALUE;
            }
            max = Math.max(front.node.val,max);
            List.add(front.node.val);
            if(left!=null) q.add(new Pair(left,front.level+1));
            if(right!=null) q.add(new Pair(right,front.level+1));
        }
    
        ans.add(max);
        return ans; 
    }
}