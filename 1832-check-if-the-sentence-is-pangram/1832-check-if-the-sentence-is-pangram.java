class Solution {
    public boolean checkIfPangram(String s) {
        int[] fre = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            fre[ch-'a']++;
        }
        for(int i = 0;i<fre.length;i++){
            if(fre[i]==0){
                return false;
            }
        }
        return true;
    }
}