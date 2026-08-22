class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i = 1;i<=arr.length;i++){
            if(map.containsKey(i) && map.get(i)==2){
                ans.add(i);
            }
        }
        return ans;
    }
}