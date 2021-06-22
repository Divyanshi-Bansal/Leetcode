class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // HashMap<Integer , Integer> map = new HashMap<>();
        
        //third-3
        
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int first=0;
        int last=0;
        for(int j=0 ; j<sorted.length;j++){
            if(sorted[j] != nums[j]){
                first = j;
                break;
            }
        }
        for(int k=sorted.length -1 ; k>=0;k--){
            if(sorted[k] != nums[k]){
                last = k;
                break;
            }
        }
        if(last-first > 0){
            return last-first+1;
        }
        return 0;
        
        
        
        
        //second-2
        
//         ArrayList<Integer> arr = new ArrayList<>();
//         ArrayList<Integer> sorted = new ArrayList<>();
//         for(int i:nums){
//             arr.add(i);
//             sorted.add(i);
//         }
//         Collections.sort(sorted);
//         int first = sorted.size();
//         int last = 0;
        // for(int j=0 ; j<sorted.size();j++){
        //     if(sorted.get(j) != arr.get(j)){
        //         // first = Math.min(first , j);
        //         first = j;
        //         break;
        //         // last = Math.max(last , j);
        //     }
        // }
        // for(int k=sorted.size()-1 ; k>=0;k--){
        //     if(sorted.get(k) != arr.get(k)){
        //         // first = Math.min(first , j);
        //         // last = Math.max(last , j);
        //         last = k;
        //         break;
        //     }
        // }
        // if(last-first >=0){
        //     return last-first+1;
        // }
        // return 0;
       
        
        //first-1
        
        // if()
        // int c=0;
        // int i=0;
        // int j=0;
        // int[] l = new int[1];
        // for(int k=0;k<nums.length-1 ; k++){
        //     if(nums[k] >= nums[k+1] ){
        //         j=k+1;
        //         i=k;
        //         if(c==0){
        //             l[0]=i;
        //             c=1;
        //         }
        //     }
        // }
        // int a = j-l[0]+1;
        // if(a==1){
        //     a=0;
        // }
        // return a ;
    }
}