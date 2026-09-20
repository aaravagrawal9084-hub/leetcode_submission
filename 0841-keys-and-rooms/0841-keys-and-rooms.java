class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size()!=0){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
        for(boolean ele : visited){
            if(ele!=true){
                return false;
            }
        }
        return true;
    }
}