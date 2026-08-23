class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int rem = pre[i]%k;
            if(rem<0){
                rem = rem + k;
            }
            if(!map.containsKey(rem)){
                map.put(rem,map.getOrDefault(rem,0)+1);
            }
            else{
                count = count + map.get(rem);
                map.put(rem,map.getOrDefault(rem,0)+1);
            }
        }
        return count;



    }
}