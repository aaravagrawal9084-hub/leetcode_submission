class Solution {
    public int[] plusOne(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        int i = arr.length-1;
        while(i>=0){
            if(arr[i]+carry>9){
                ans.add(0);
            }
            else {
                ans.add(arr[i]+carry);
                carry = 0;
            }
            i--;
            
        }
        if(carry==1) ans.add(carry);
        Collections.reverse(ans);
        int[] brr = new int[ans.size()];
        for(int j = 0;j<brr.length;j++){
            brr[j] = ans.get(j);
        }
        return brr;
    }
}