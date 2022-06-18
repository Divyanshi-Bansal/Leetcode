class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxv = 0
        minv = prices[0]
        
        length = len(prices)
        
        for index in prices:
            minv = min(index,minv)
            maxv = max(maxv, index-minv)
            
            
            
            
            # for price in range(index+1,length):
            #     result = prices[price] - prices[index]
            #     if result > maxv:
            #         maxv = result
        
        return maxv
                