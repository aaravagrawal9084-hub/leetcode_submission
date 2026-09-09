class Solution {
    public int[] singleNumber(int[] arr) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i  = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int[] nums = new int[2];
        int a = 0;
        for(int i  = 0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                nums[a++] = arr[i];
            }
        }
        return nums;
    }
}