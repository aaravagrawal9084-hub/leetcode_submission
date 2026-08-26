class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i<arr.length;i++){
        if(!set.contains(arr[i])){
            set.add(arr[i]);
        }
        else{
            ans.add(arr[i]);
        }
       }
       return ans;
    }
}