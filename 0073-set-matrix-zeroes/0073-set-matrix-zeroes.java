class Solution {
    public void setZeroes(int[][] arr) {
        int k = -1;
        int l = -1;
        int[][] copy = new int[arr.length][arr[0].length];
        for (int o = 0; o < arr.length; o++) {
            for (int p = 0; p < arr[0].length; p++) {
                copy[o][p] = arr[o][p];
            }
        }
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
            if(copy[i][j]==0){
                k = i;
                l = j;
                System.out.println(k+" "+l);
            for(int m = 0;m<arr.length;m++){
                for(int n = 0;n<arr[0].length;n++){
                    if(m==k){
                        arr[m][n]=0;
                    }
                    else if(n==l){
                        arr[m][n]=0;
                    }
                }
            }
            }
            

        }
    }
    }
}