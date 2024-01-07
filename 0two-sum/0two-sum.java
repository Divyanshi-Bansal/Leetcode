class Solution {
    public int[] twoSum(int[] nums, int target) {//[2,7,11,15]
        
        int length = nums.length;
        //o(n2)
        // for (int i = 0 ; i < length ; i++){
        //     for(int j = i+1; j<length; j++){
        //         int sum = nums[i] + nums[j];
        //         if(sum == target){
        //             int[] ans = {i,j};
        //             return ans;
        //         }
        //     }
        // }
        // return nums;
        Map<Integer, Integer> map = new HashMap<>();  //{7=0,2=1,-2=2,6=3}
        for(int i=0;i<length;i++){
            
            if(map.containsKey(nums[i])){
                int[] ans = {i,map.get(nums[i])};
                return ans;
            }else{
                map.put(target-nums[i],i);
            }
        }
        
        return nums;
        
    }
}