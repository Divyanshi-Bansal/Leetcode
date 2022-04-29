class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        countMap = {}
        count = 0
        for num in nums:
            if num in countMap:
                count += countMap[num]
                countMap[num] += 1
            else:
                countMap[num] = 1
        return count
            