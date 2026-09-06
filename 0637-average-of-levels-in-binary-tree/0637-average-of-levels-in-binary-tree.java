class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans = new ArrayList<>();
        // if(root==null) return ans;
        ArrayList<Integer> List = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int prevlevel = 0;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair front = q.remove();
            TreeNode left = front.node.left;
            TreeNode right = front.node.right;
            if(front.level!=prevlevel){
                double sum = 0.0;
                for(int i = 0;i<List.size();i++){
                    sum = sum + List.get(i);
                }
                ans.add((double)(sum/List.size()));
                prevlevel++;
                List = new ArrayList<Integer>();
            }
            List.add(front.node.val);
            if(left!=null) q.add(new Pair(left,front.level+1));
            if(right!=null) q.add(new Pair(right,front.level+1));
        }
        double sum = 0.0;
        for(int i = 0;i<List.size();i++){
            sum = sum + List.get(i);
        }
        ans.add((double)(sum/List.size()));
        return ans; 
    }
}