class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        for(int i = 0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
         for(int i = 0;i<nums2.length;i++){
            arr[nums1.length+i] = nums2[i];
        }
        Arrays.sort(arr);
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int value = Integer.MIN_VALUE;
        if((arr.length)%2==0){
            int lo = 0;
            int hi = arr.length-1;
            int mid = lo + (hi-lo)/2;
            System.out.println(arr[mid]+" "+arr[mid+1]);
              return ((double) arr[mid +1] + arr[mid]) / 2;
        }
        else return (arr[arr.length/2]);
    }
}