class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);//[1,1,2,8]
        Arrays.sort(nums2);//[2,8]
        
        int nums1Length = nums1.length;//4
        int nums2Length = nums2.length;//2
        
        int index1 = 0;
        int index2 = 0;
        
        ArrayList<Integer> intersectedArr = new ArrayList<>();
        
        while(index1<nums1Length && index2<nums2Length){
            
            if(nums1[index1]==nums2[index2]){
                intersectedArr.add(nums1[index1]);
                index1++;
                index2++;
                
            }else if(nums1[index1]<nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        int[] intArray = intersectedArr.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}