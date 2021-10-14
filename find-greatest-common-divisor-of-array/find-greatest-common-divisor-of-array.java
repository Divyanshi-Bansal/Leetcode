class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return gcd(min,max);
        
    }
    
    public int gcd(int a, int b){
        if (a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
}
