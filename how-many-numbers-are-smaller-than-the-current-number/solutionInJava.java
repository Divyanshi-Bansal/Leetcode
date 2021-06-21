class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> sorted = new ArrayList<>();
        // convert array nums into arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: nums){
            arr.add(i);
            sorted.add(i);
        }
        Collections.sort(sorted);//sorted
        for(int j=0;j<arr.size();j++){
            ans[j] = sorted.indexOf(arr.get(j));
        }
        return ans;
    }
}
