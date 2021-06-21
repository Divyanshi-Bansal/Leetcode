class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr = sorted(nums)
        ans = []
        for i in nums:
            ans.append(arr.index(i))
        return ans
            
        