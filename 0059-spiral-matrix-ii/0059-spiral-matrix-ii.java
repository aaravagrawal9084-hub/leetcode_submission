class Solution {
    public int[][] generateMatrix(int s) {
        int[][] arr  = new int[s][s];
        int a = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length , n =arr[0].length;
        int fr = 0, lr = m-1, fc = 0, lc = n-1;
        while(fr<=lr && fc<=lc){
        for(int i =fc;i<=lc;i++){
            arr[fr][i] = a++;
    
        }
        fr++;
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = fr;i<=lr;i++){
            arr[i][lc] = a++;
        }
        lc--;
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = lc;i>=fc;i--){
            arr[lr][i] = a++;
        }
        lr--; 
        if(fr>lr || fc>lc){
            break;
        }
        for(int i = lr;i>=fr;i--){
            arr[i][fc] = a++;
        }
        fc++;
        if(fr>lr || fc>lc){
            break;
        }
        }
        return arr;
    }
}