class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        ans= ''
        for i in range(len(indices)):
            index = indices.index(i)
            ans = ans + s[index]
        return ans
            
        