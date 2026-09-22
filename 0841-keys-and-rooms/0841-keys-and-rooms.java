class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(q.size()!=0){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!visited[ele]){
                q.add(ele);
                visited[ele] =true;
                }
                
            }
        }
        for(int i = 0;i <visited.length;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;

    }
}