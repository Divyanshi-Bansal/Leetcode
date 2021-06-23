class Solution {
    public int findMin(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        return sorted[0];
    }
}