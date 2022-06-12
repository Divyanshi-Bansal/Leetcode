class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        length = m+n
        index=0
        for i in range(m,length):
            nums1[i] = nums2[index]
            index +=1
            
        # nums1 = sorted(nums1)
            
        for i in range(length):
            for j in range(i+1,length):
                if nums1[i]> nums1[j]:
                    temp = nums1[i]
                    nums1[i] = nums1[j]
                    nums1[j] = temp
                    
                    