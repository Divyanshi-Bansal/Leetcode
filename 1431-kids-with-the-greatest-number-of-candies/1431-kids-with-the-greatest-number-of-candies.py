class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        soln=[]
        greatest = max(candies)
        for candy in candies:
            soln.append(candy+extraCandies >= greatest)
        return soln