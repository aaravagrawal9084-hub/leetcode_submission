class Solution {
    public int findCircleNum(int[][] arr) {
        int n = arr.length;
        boolean [] visited = new boolean[n];
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(!visited[i]){
                bfs(i,arr,visited);
                count++;
            }
        }
        return count;
    }
    public static void bfs(int i,int[][] arr, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size()!=0){
            int front = q.remove();
            for(int j = 0;j<arr.length;j++){
                if(arr[front][j]==1 && visited[j]==false){
                    visited[j] = true; 
                    q.add(j); 
                }
            }
        }
    }

}