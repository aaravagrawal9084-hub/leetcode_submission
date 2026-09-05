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
        ArrayList<List<Integer>> ans  = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 1;
        ArrayList<Integer> list = new ArrayList<>();
        q.add(new Pair(root,1));
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;
            if(level!=currLevel){ // important
                ans.add(list);
                list = new ArrayList<>();
                currLevel++;
            }
            list.add(node.val);
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        ans.add(list);
        return ans;
        
    }
}