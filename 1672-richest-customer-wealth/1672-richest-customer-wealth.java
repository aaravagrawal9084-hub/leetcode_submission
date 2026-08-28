class Solution {
    public int maximumWealth(int[][] arr) {
        int maxsum = 0 ;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
            }
            maxsum  = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}