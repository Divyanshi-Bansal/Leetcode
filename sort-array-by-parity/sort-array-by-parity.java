class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int k=0;k<nums.length ; k++){
            if(nums[k]%2==0){
                even.add(nums[k]);
            }
            else{
                odd.add(nums[k]);
            }
        }
        int[] ans = new int[nums.length];
                             int index=0;
        // System.out.println(even.get(0));
        for(int i=even.size()-1 ; i>=0 ; i--){
            ans[index] = even.get(i);
            index++;
        }
        for(int j = 0;j<odd.size() ; j++){
            ans[index] = odd.get(j);
            index++;
        }
                             return ans;
    }
}