class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        return dfs(n,arr);
    }
    public static int dfs(int n,int[] arr){
        if(n==0 || n==1){
            // arr[n] = n;
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int left = dfs(n-1,arr);
        int right = dfs(n-2,arr);
        arr[n] = left + right;
        return left + right;
    }
}