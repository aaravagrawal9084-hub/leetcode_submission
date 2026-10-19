class Solution {
    public int minPartitions(String s) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<s.length();i++){
            int x = s.charAt(i)-'0';
            max = Math.max(x,max);
        }
        return max;
    }
}