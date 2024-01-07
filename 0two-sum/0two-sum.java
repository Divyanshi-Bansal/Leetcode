class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int length = nums.length;
        for (int i = 0 ; i < length ; i++){
            for(int j = i+1; j<length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        return nums;
    }
}