class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        map.put(0,-1);
        for(int i = 0;i<arr.length;i++){
            int rem = pre[i] % k;
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
            else{
                int pi = i - map.get(rem);
                if(pi>=2){
                    return true;
                }
            }
        }
        return false;
         
    }
}