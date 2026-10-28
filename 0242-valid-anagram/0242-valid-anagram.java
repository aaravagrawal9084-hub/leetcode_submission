class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)-1);
            }
            if(!map1.containsKey(ch)){
                return false;
            }
        }
        for(char ele : map1.keySet()){
            if(map1.get(ele)!=0){
                return false;
            }
        }
        
        return true;
    }
}