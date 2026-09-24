class Solution{
    public int smallestIndex(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int x = digit(arr[i]);
            if(i==x){
                return i;
            }
        }
        return -1;
        
    }
    public int digit(int n){
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;

    }
}