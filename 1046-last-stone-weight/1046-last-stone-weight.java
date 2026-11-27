class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
        }
        while(pq.size()!=1){
            int top = pq.remove();
            int top2 = pq.remove();
            if(top2>top){
                pq.add(top2-top);
            }
            else if(top>top2){
                pq.add(top-top2);
            }
            if(pq.size()==0){
                return 0;
            }
        }
        return pq.peek();
    }
}