class Solution {
    public int reverse(int n) {
        int ld = 0 ;
    long rev = 0;
        while(n!=0){
            ld = n%10;
            rev = ld + (rev*10);
            n = n/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
}