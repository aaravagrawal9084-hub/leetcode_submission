class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
               if(Pallindrome(s.substring(i,j),count)){
                count++;
               }
            }
        }
        return count;
    }
    public boolean Pallindrome(String sub , int count){
        int i = 0;
        int j = sub.length()-1;
        while(i<=j){
            if(sub.charAt(i)!=sub.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}