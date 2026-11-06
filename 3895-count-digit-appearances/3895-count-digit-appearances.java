class Solution {
    public int countDigitOccurrences(int[] arr, int digit) {
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count = call(arr[i],digit,count);
        }
        return count;
    }
    public static int call(int n,int digit,int count){
        while(n!=0){
            int ld = n%10;
            if(ld==digit){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    
}