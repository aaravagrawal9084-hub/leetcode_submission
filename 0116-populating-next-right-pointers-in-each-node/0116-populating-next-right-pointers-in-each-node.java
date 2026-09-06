/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
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
    public Node connect(Node root) {
        if(root==null) return null;
        ArrayList<Node> List = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        int prevlevel = 0;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair front = q.remove();
            Node left = front.node.left;
            Node right = front.node.right;
            if(front.level!=prevlevel){
                for(int i = 0; i < List.size() - 1; i++) {
                    List.get(i).next = List.get(i + 1);
                }
                prevlevel++;
                List = new ArrayList<Node>();
            }
            List.add(front.node);
            if(left!=null) q.add(new Pair(left,front.level+1));
            if(right!=null) q.add(new Pair(right,front.level+1));
        }
        for(int i = 0; i < List.size() - 1; i++) {
            List.get(i).next = List.get(i + 1);
        }
        return root;
    }
}