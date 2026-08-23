class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen = 0;
        int [] pre = new int[arr.length];
        int[] fpre = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                fpre[i] = -1;
            }
            else fpre[i] = 1;
        }
        pre[0] = fpre[0];
        for(int i =1;i<fpre.length;i++){
            pre[i] = pre[i-1] + fpre[i];
        }
        for(int i = 0;i<pre.length;i++){
            if(!map.containsKey(pre[i])){
                map.put(pre[i],i);
            }
            else{
                maxlen = Math.max(maxlen,i-map.get(pre[i]));
            }
        }
        return maxlen;
        
    }
}