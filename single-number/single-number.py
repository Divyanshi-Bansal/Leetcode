class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # for i in nums:
        #     if(nums.count(i) == 1):
        #         return i
        
        l = len(nums)
        _dict = {}
        for i in range(l):
            if(nums[i] in _dict.keys()):
                _dict[nums[i]] = _dict[nums[i]] + 1
            else:
                _dict[nums[i]] = 1
        
        for key,value in _dict.items():
            if value==1:
                return key
            