class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        count = 0
        length = len(nums)
        for i in range(length-1):
            for j in range(i+1,length):
                if nums[i] == nums[j] and (i*j)%k == 0:
                    count += 1
        return count