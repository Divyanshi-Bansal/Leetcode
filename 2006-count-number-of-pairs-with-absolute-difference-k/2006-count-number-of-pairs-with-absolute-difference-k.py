class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        count = 0
        if len(nums) == 1:
            return 0
        pairs = combinations(nums,2)
        for pair in pairs:
            if abs(pair[0]-pair[1]) == k:
                count += 1
        return count
        