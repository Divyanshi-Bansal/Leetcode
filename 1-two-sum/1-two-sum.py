class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexies = []
        sec = {}
        length = len(nums)
        for i in range(length):
            if target-nums[i] not in sec.keys():
                sec[nums[i]] = i
            elif target-nums[i] in sec.keys():
                indexies.append(i)
                indexies.append(sec[target-nums[i]])
        sort = sorted(indexies)
        return sort
                