class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int [] brr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);
        int i = 0;
        int j = brr.length-1;
        int left = 0;
        int right = 0;
        while(i!=arr.length){
            if(brr[i]!=arr[i]){
                left = i;
                break;
            }
            i++;
        }
        while(j!=0){
            if(brr[j]!=arr[j]){
                right = j;
                break;
            }
            j--;
        }
        if(left>=right){
            return 0;
        }
        return right - left + 1;
    }
}