class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1Length = len(nums1)
        nums2Length = len(nums2)
        
        final = []
        
        if nums2Length < nums1Length:
            for num in nums2:
                if num in nums1:
                    final.append(num)
                    nums1.remove(num)
        else:
            for num in nums1:
                if num in nums2:
                    final.append(num)
                    nums2.remove(num)
            
        
        return final