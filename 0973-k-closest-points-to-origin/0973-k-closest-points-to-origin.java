class Triplet implements Comparable<Triplet>{
    int d;
    int x;
    int y;
    Triplet(int d,int x,int y){
        this.d = d;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplet t){
        return t.d - this.d;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int[] arr : points){
            int x = arr[0];
            int y = arr[1];
            int d = x*x + y*y;
            pq.add(new Triplet(d,x,y));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[][] brr = new int[k][2];
        for(int i = 0;i<k;i++){
            Triplet top = pq.remove();
            brr[i][0] = top.x;
            brr[i][1] = top.y;
        }
        return brr;
    }
}