#User function Template for python3

class Solution:
    def rearrange(self,arr, n):
        # code here
        negative = []
        positive = []
        
        for num in arr:
            if num < 0:
                negative.append(num)
            else:
                positive.append(num)

        length = min(len(negative),len(positive))
        index = 0
        for i in range(length):
            arr[index] = positive[i]
            arr[index+1] = negative[i]
            index += 2
        l = length+length
        limit = length
        for i in range(l,n):
            if limit != len(negative):
                arr[i] = negative[l-length]
                length -= 1
            else:
                arr[i] = positive[l-length]
                length -= 1
            
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	tc = int(input())
	while tc > 0:
		n = int(input())
		arr = list(map(int, input().strip().split()))
		ob = Solution()
		ob.rearrange(arr, n)
		for x in arr:
			print(x, end=" ")
		print()
		tc -= 1

# } Driver Code Ends