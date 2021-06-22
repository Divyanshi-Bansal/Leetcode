class Solution {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        
        for(int i=0;i<length;i++){
            if(max1 >= nums[i]){
                max1 = nums[i]; //1st larger number
            }
            else if(max2 >= nums[i]){
                max2 = nums[i]; //2nd larger number after max1
            }
            else{
                return true; //this else only run if the element is larger than max1 , max2
            }
        }
        
        return false;
    }
}