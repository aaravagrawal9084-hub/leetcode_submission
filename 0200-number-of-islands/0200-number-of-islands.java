class Solution {
    public int numIslands(char[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count =0 ;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, boolean[][] visited,char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        while(q.size()!=0){
            int[] front = q.poll();
            int x = front[0];
            int y = front[1];
            if(x + 1 < grid.length &&
           grid[x + 1][y] == '1' &&
           !visited[x + 1][y]) {

            visited[x + 1][y] = true;
            q.add(new int[]{x + 1, y});
        }

        // UP
        if(x - 1 >= 0 &&
           grid[x - 1][y] == '1' &&
           !visited[x - 1][y]) {

            visited[x - 1][y] = true;
            q.add(new int[]{x - 1, y});
        }

        // RIGHT
        if(y + 1 < grid[0].length &&
           grid[x][y + 1] == '1' &&
           !visited[x][y + 1]) {

            visited[x][y + 1] = true;
            q.add(new int[]{x, y + 1});
        }

        // LEFT
        if(y - 1 >= 0 &&
           grid[x][y - 1] == '1' &&
           !visited[x][y - 1]) {

            visited[x][y - 1] = true;
            q.add(new int[]{x, y - 1});
        }
        }
    }
}
