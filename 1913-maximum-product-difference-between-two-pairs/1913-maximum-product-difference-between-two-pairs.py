class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        sortedNums = sorted(nums)
        length = len(sortedNums)
        minProd = sortedNums[0]*sortedNums[1]
        maxProd = sortedNums[length-2] * sortedNums[length-1]
        return maxProd-minProd