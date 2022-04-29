class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        soln = []
        length = len(nums)
        for i in range(0,length-1,2):
            soln.extend([nums[i+1]]*nums[i])
        
        return soln