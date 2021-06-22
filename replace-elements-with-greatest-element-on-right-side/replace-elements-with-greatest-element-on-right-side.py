class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        ans=[]
        # print(ans)
        if(len(arr)<2):
            ans.append(-1)
            return ans
        for i in range(len(arr)-2):
            maxv = []
            # print(i)
            # print(arr[i])
            maxv[:] = arr[i+1:]
            ans.append(max(maxv))
        # print(ans)
        ans.append(arr[len(arr)-1])
        ans.append(-1)
        # print(ans)
        return ans
        
        