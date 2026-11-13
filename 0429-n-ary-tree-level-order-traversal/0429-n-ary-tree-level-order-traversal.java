/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        bfs(root,ans);
        return ans;
    }
    public void bfs(Node root, ArrayList<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int pl = 0;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level != pl){
                ans.add(list);
                pl++;
                list = new ArrayList<Integer>();
            }
            list.add(front.node.val);
            for (Node child : node.children) {
                q.add(new Pair(child, front.level + 1));
            }
        }
        ans.add(list);
    }
}

