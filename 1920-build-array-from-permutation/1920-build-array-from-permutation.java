class Solution {
    public int[] buildArray(int[] nums) {
        int [] brr = Arrays.copyOf(nums,nums.length);
        for(int i = 0;i<nums.length;i++){
            brr[i] = nums[nums[i]];
        }
        return brr;
    }
}