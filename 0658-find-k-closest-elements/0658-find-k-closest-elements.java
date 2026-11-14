class Pair implements Comparable<Pair>{
    int ele;
    int dis;
    Pair(int ele,int dis){
        this.ele = ele;
        this.dis = dis;
    }
    public int compareTo(Pair p){
        if(this.dis==p.dis){
            return p.ele - this.ele;
        }
        return p.dis - this.dis;
    }

}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            pq.add(new Pair(arr[i],Math.abs(x-arr[i])));
        }
        while(pq.size()>k){
            pq.remove();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size()!=0){
            ans.add(pq.remove().ele);
        }
        Collections.sort(ans);
        return ans;

    }
}