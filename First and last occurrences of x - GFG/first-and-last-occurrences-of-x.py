#User function Template for python3


def find(arr,n,x):
    # code here
    start = -1
    end = -1
    for index, element in enumerate(arr):
        if element == x:
            if start == -1:
                start = index
            end = index
    return [start, end]


#{ 
#  Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ans=find(arr,n,x)
    print(*ans)
# } Driver Code Ends