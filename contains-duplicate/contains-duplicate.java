class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int lengthOfNums = nums.length;
//         both treeset and set can be used
        // TreeSet<Integer> numsWithOutDuplicate = new TreeSet<>();
        Set<Integer> numsWithOutDuplicate = new HashSet<>();
        for(int num: nums){
            numsWithOutDuplicate.add(num);
        }
        if(numsWithOutDuplicate.size() == lengthOfNums){
            return false;
        }
        return true;
        
        
    }
}