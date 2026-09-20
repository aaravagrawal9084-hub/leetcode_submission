class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[n];// initially sab false hote hai
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,isConnected);
                count++; 
            }
        }
        return count;
    }
    public static void bfs(int i,boolean[] visited,int[][] arr){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size()>0){
            int front = q.remove();
            for(int j = 0;j<arr.length;j++){
                if(arr[front][j]==1 && visited[j]==false){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}