class Solution {
    class Pair implements Comparable<Pair>{
        int fre;
        char ch;
        Pair(int fre,char ch){
            this.fre = fre;
            this.ch = ch;
        }
        public int compareTo(Pair p){
            if(this.fre == p.fre) {
                return p.ch - this.ch;
            }
            return p.fre - this.fre;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ele : map.keySet()){
            pq.add(new Pair(map.get(ele),ele));
        }
        while(pq.size()!=0){
            Pair els = pq.remove();
            int x = els.fre;
            for(int i = 1;i<=x;i++){
                sb.append(els.ch);
            }
        }
        return sb.toString();

    }
}