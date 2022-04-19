class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        soln = []
        numsLen = len(nums)
        for i in range(numsLen):
            soln.append(nums[nums[i]])
        return soln