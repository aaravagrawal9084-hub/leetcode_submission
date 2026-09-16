class Solution {
    public int partitionDisjoint(int[] arr) {
        int[] premin = new int[arr.length];
        int[] suffmin = new int[arr.length];
        premin[0] = arr[0];
        suffmin[0] = arr[arr.length - 1];
        for(int i = 1; i < premin.length; i++){
            premin[i] = Math.max(premin[i-1], arr[i]);
        }
        suffmin[arr.length - 1] = arr[arr.length - 1];
        for(int i = suffmin.length - 2; i >= 0; i--){
            suffmin[i] = Math.min(suffmin[i+1], arr[i]);
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(premin[i] <= suffmin[i+1]){
                return i + 1;
            }
        }
        return 1;
    }
}