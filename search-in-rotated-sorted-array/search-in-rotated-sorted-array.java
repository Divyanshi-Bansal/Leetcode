class Solution {
    public int search(int[] nums, int target) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i: nums){
            arr.add(i);
        }
        
        int index = -1;
        if(arr.indexOf(target) >= 0){
            return arr.indexOf(target);
        }
        return index;
    }
}