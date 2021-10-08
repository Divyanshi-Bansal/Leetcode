class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        total = len(nums)
        count_target = nums.count(val)
        remaining = total - count_target
        for i in range(count_target):
            nums.remove(val)
        
        
        