class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n){
           if(arr1[i]<arr2[j]){
            arr[k] = arr1[i];
            i++;
           }
           else{
            arr[k] = arr2[j];
            j++;
           }
           k++;
        }
         while(i<m){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j<n){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        for(int l = 0;l<arr.length;l++){
            arr1[l] = arr[l];
        }


    }
}