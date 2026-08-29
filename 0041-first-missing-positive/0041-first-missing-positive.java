class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return arr.length + 1 ;
    }
}