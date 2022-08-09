class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int[] ans = new int[2*length];
        int count = 0;
        for(int i=0;i<length;i++){
            if(map.containsKey(nums[i])){
                count += map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return count;
    }
}