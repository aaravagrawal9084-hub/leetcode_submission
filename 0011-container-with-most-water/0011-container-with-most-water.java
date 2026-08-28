class Solution {
    public int maxArea(int[] arr) {
        int maxarea = 0;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            maxarea = Math.max(maxarea,(Math.min(arr[i],arr[j]))*(j-i));
            if(arr[i]<arr[j]){
                i++;
            }
            else j--;
        }
        return maxarea;
    }
}