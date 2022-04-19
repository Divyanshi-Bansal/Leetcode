class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        #brute force
        # maxWealth = 0
        # for i in accounts:
        #     total = 0
        #     for j in i:
        #         total += j
        #     if maxWealth < total:
        #         maxWealth = total
        # return maxWealth
        
        return max([sum(account) for account in accounts])
    
    