class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        ans = [-1 , -1]
        if target in nums:
            ans[0] = nums.index(target)
            for i in range(len(nums)):
                if(nums[i]==target):
                    ans[1] = i
        return ans