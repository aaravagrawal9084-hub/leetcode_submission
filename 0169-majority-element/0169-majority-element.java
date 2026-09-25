class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}