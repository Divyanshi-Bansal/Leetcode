class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        length = len(nums)
        arr = {}
        for num in nums:
            if num not in arr.keys():
                arr[num] = 1
            elif num in arr.keys():
                arr[num] += 1
                return True
        return False
        