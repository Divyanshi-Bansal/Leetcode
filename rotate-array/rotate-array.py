class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        index = len(nums) - k%len(nums)
        last = nums[index:]
        first = nums[0:index]
        print(last)
        nums[:] = last +first
        return nums
            
        