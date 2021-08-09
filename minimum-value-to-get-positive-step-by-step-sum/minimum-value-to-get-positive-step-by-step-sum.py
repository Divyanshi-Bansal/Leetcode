class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        X=[]
        s=0
        for i in nums:
            s=s+i
            X.append(s)
        minn=min(X)
        if minn<=0:
            return abs(minn)+1
        else:
            return 1