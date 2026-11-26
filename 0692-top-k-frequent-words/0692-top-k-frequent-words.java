class Solution {
    class Pair implements Comparable<Pair>{
        int fre;
        String s;
        Pair(int fre,String s){
            this.fre = fre;
            this.s = s;
        }
        public int compareTo(Pair p){
            if(this.fre == p.fre) {
            return p.s.compareTo(this.s);
            }
            return this.fre - p.fre;
        }
    }
    public List<String> topKFrequent(String[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String s : map.keySet()){
            pq.add(new Pair(map.get(s),s));
            if(pq.size()>k){
                pq.remove();
            }
        }
        while(pq.size()!=0){
            Pair x = pq.remove();
            ans.add(x.s);
        }
        Collections.reverse(ans);
        return ans;
    }
}