class Solution {
    public char nextGreatestLetter(char[] s, char target) {
        char fc = s[0];
        int lo = 0;
        int hi = s.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            char ch = s[mid];
            if(ch>target){
                fc = ch;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return fc;
    }
}