class Pair implements Comparable<Pair>{
    int ele;
    int fre;
    Pair(int ele,int fre){
        this.ele = ele;
        this.fre = fre;
    }
    public int compareTo(Pair p){
        return this.fre - p.fre;
    }
}
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
        }
        while(pq.size()>k){
            pq.remove();
        }
        int[] brr = new int[k];
        for(int i = 0;i<k;i++){
            brr[i] = pq.remove().ele;
        }
        return brr;
    }
}