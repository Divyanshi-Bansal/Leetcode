class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        length = len(nums)
        maxSum = nums[0]
        sum_ = 0
        for num in range(length):
            # sum_ = 0
            # for _num in range(num, length):
            #     sum_ += nums[_num]
            #     maxSum = max(maxSum,sum_)
            
            sum_ += nums[num]
            maxSum = max(maxSum,sum_)
            if sum_ < 0:
                sum_ = 0
        return maxSum
        