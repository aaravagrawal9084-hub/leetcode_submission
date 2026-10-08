class Solution {
    public int[] nextGreaterElements(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            ans.add(arr[i]);
        }
         for(int i = 0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int greater = -1;
            for (int j = i + 1; j < i + n; j++) {
                if (ans.get(j) > arr[i]) {
                    greater = ans.get(j);
                    break;
                }
            }
            arr[i] = greater;
        }
        return arr;
    }
}