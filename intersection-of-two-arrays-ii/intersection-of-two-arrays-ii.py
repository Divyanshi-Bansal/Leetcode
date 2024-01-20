class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        nums1 = sorted(nums1)
        nums2 = sorted(nums2)
        
        l1 =len(nums1) #[1,2,2,3]
        l2 = len(nums2) #[2,2]
        
        intersected = []
        
        index1 = 0
        index2 = 0
        while(index1 < l1 and index2 < l2):
            if(nums1[index1] == nums2[index2]):
                intersected.append(nums1[index1])
                index1 += 1
                index2 += 1
            elif(nums1[index1] < nums2[index2]):
                index1 += 1
            else:
                index2 += 1
            
        
        
        return intersected
                
                
        