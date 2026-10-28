class Solution {
    class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public void setZeroes(int[][] matrix) {
        HashMap<Integer, Pair> map = new HashMap<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        // Store the positions of all zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    map.put(count++, new Pair(i, j));
                }
            }
        }
        // Make the corresponding rows and columns zero
        for (Pair p : map.values()) {
            int r = p.row;
            int c = p.col;
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}