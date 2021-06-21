class Solution {
    public void rotate(int[] nums, int k) {
        int index = nums.length -k%nums.length;
        int[] last = new int[nums.length];
        int li=0;
        for(int i=index;i<nums.length ; i++){
            last[li] = nums[i];
            li++;
        }
        for(int j=0;j<index ; j++){
            last[li] = nums[j];
            li++;
        }
        for(int l=0;l<nums.length ; l++){
            nums[l] = last[l];
        }
    }
}
