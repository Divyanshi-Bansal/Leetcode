class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            sum = sum + nums[i];
            output[i] = sum;
        }
        return output;
    }
}