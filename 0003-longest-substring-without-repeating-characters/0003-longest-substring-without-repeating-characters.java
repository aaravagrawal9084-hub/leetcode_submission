class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                i = Math.max(i,map.get(ch)+1);
            }
            maxlen = Math.max(maxlen,j-i+1);
            System.out.println(maxlen+" "+i+" "+j);
            map.put(ch,j);
            j++;
        }
        return maxlen;
    }
}