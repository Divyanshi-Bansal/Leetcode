class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        soln = []
        length = len(nums)
        for i in range(n):
            soln.append(nums[i])
            soln.append(nums[length-n+i])
        return soln