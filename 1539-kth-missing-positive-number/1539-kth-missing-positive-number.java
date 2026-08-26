class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>(1000);
        int m = 0;
        for(int i = 1;i<=10000;i++){
            if(m<arr.length && arr[m]==i){
                m++;
                continue;
            }
            else ans.add(i);
        }
        return ans.get(k-1);
    }
}