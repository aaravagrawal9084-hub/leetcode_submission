class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int count = 0 ;
        while(i<=j){
           int sum = arr[i]+arr[j];
           if(sum<=limit){
            i++;
           }
           j--;
           count++;
        }
        return count;
    }
}