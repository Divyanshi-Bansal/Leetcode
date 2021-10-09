class Solution {
    public int searchInsert(int[] nums, int target) {
        int find = 0;
        int index = 0;
        for (int i =0 ;i<nums.length ; i++){
            if(target == nums[i]){
                find = 1;
                return i;
            }
            if(target < nums[i]){
                index = i;
                return index;
            }
        }
        if (find == 0){
            return nums.length;
        }
        return 0;
    }
}