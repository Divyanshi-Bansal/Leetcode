#User function Template for python3

class Solution:
    def getPairsCount(self, arr, n, k):
        # code here
        # c = 0
        # for i in range(n):
        #     for j in range(i+1,n):
        #         if arr[i]+arr[j] == k:
        #             c = c +1
        # return c
        
        count = 0
        countMap = {}
        for element in arr:
            if (k-element) in countMap:
                count += countMap[k-element]
            if element in countMap:
                countMap[element] += 1
            else:
                countMap[element] = 1
        return count
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getPairsCount(arr, n, k)
        print(ans)
        tc -= 1

# } Driver Code Ends