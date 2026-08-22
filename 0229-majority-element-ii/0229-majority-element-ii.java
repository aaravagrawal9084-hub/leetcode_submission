class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0 ;i<arr.length;i++){
            if(!set.contains(arr[i])){
                if(map.get(arr[i])>n/3){
                    ans.add(arr[i]);
                }
                set.add(arr[i]);
            }
        }
        return ans;
    }
}