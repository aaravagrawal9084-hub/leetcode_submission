class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        ArrayList<Integer> List = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int prevlevel = 0;
        q.add(new Pair(root,0));
        int lastlevel = 0;
        while(q.size()!=0){
            Pair front = q.remove();
            TreeNode left = front.node.left;
            TreeNode right = front.node.right;
            if(front.level!=prevlevel){
                if(front.level%2!=0){
                    ans.add(List);
                }
                else{
                    Collections.reverse(List);
                    ans.add(List);
                }
                prevlevel++;
                List = new ArrayList<Integer>();
            }
            lastlevel = front.level;
            List.add(front.node.val);
            if(left!=null) q.add(new Pair(left,front.level+1));
            if(right!=null) q.add(new Pair(right,front.level+1));
        }
        if((lastlevel)%2!=0){
            Collections.reverse(List);
            ans.add(List);
        }
        else{
            ans.add(List);
        }
        return ans; 
    }
}